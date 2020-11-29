package com.example.videoviewpagerfirebase;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {
    VideoView videoView;
    ProgressBar pBar;
    TextView title,desc;

    public viewHolder(@NonNull View itemView) {
        super(itemView);
        videoView=itemView.findViewById(R.id.vidView);
        pBar=itemView.findViewById(R.id.pBar);
        title=itemView.findViewById(R.id.vTitle);
        desc=itemView.findViewById(R.id.vDesc);
    }

     void setData(vModel obj) {
        videoView.setVideoPath(obj.getUrl());
        title.setText(obj.getTitle());
        desc.setText(obj.getDesc());



        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                pBar.setVisibility(View.GONE);
                mp.start();
            }
        });


        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.start();
            }
        });

    }

}
