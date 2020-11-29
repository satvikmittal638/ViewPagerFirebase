package com.example.videoviewpagerfirebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
ViewPager2 viewPager2;
RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2=findViewById(R.id.viewP);

        FirebaseRecyclerOptions<vModel> options =
                new FirebaseRecyclerOptions.Builder<vModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("ViewPager"), vModel.class)
                        .build();
        adapter=new RecyclerViewAdapter(options);
        viewPager2.setAdapter(adapter);
    }


    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

}