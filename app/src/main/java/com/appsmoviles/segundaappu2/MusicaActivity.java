package com.appsmoviles.segundaappu2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MusicaActivity extends AppCompatActivity {

    ImageView iPlay, iStop, iExit;
    MediaPlayer mp = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);

        iPlay = findViewById(R.id.iv_play);
        iStop = findViewById(R.id.iv_stop);
        iExit = findViewById(R.id.iv_exit);

        iPlay.setEnabled(true);
        iStop.setEnabled(false);
        iExit.setEnabled(true);

        iPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iPlay.setEnabled(false);
                iStop.setEnabled(true);
                iExit.setEnabled(false);
                mp = MediaPlayer.create(getApplicationContext(), R.raw.arabella);
                mp.start();
            }
        });

        iStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iPlay.setEnabled(true);
                iStop.setEnabled(false);
                iExit.setEnabled(true);
                mp.stop();
            }
        });

        iExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hasta luego", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}