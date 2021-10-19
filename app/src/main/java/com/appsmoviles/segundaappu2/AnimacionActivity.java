package com.appsmoviles.segundaappu2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AnimacionActivity extends AppCompatActivity {

    ImageView ivAnimacion;
    Button btnIniciar, btnDetener;

    //Animacion
    private AnimationDrawable animacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacion);
        //GUI
        ivAnimacion = findViewById(R.id.iv_imagen_animacion);
        btnIniciar = findViewById(R.id.btn_inic_animacion);
        btnDetener = findViewById(R.id.btn_stop_animacion);

        //Asignar animacion a image view
        ivAnimacion.setBackgroundResource(R.drawable.animacion);

        //Obtener animacion(asignada) de fondo del image view
        animacion = (AnimationDrawable)ivAnimacion.getBackground();

        //Listeners
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animacion.start();
            }
        });

        btnDetener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animacion.stop();
            }
        });

    }
}