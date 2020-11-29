package com.example.videoviewpagerfirebase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class RecyclerViewAdapter extends FirebaseRecyclerAdapter<vModel,viewHolder> {
    //takes the options to its superclass
    public RecyclerViewAdapter(@NonNull FirebaseRecyclerOptions<vModel> options) {
        super(options);
    }

    @NonNull
    @Override
    //creates a runtime view
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_videodesign,parent,false);
        return new viewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull viewHolder holder, int position, @NonNull vModel model) {
        //data would be setted by a method in viewholder class
        holder.setData(model);
    }



}
