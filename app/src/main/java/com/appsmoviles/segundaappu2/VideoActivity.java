package com.appsmoviles.segundaappu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView vvVideo;
    Button btnVideo1, btnVideo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        //Rutas de videos
        String loc1 = "android.resource://"+getPackageName()+"/"+R.raw.joker,
                loc2 = "android.resource://"+getPackageName()+"/"+R.raw.rocky;
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //Instanciar GUI
        vvVideo = findViewById(R.id.vv_video);
        btnVideo1 = findViewById(R.id.btn_video1);
        btnVideo2 = findViewById(R.id.btn_video2);

        //Controles video
        vvVideo.setMediaController(new MediaController(this));

        //Listeners para reproducir cada video
        btnVideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vvVideo.setVideoURI(Uri.parse(loc1));
                vvVideo.start();
            }
        });

        btnVideo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vvVideo.setVideoURI(Uri.parse(loc2));
                vvVideo.start();
            }
        });
    }
}