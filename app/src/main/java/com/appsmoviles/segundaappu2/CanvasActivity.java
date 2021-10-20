package com.appsmoviles.segundaappu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.View;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CanvasDraw(this));
    }
}

class CanvasDraw extends View {

    //Dibujo e imagen
    private ShapeDrawable miDibujo;
    private Drawable miImagen;

    public CanvasDraw(Context context) {
        super(context);

        //Definir dibujo e imagen
        miDibujo = new ShapeDrawable();
        miImagen = context.getResources().getDrawable(R.drawable.fondo_mine);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //Dimensiones de pantalla
        int resX = canvas.getWidth();
        int resY = canvas.getHeight()-300; //Ajustar ubicacion de dibujo en general

        //Imagen de fondo
        miImagen.setBounds(0,0,canvas.getWidth(),canvas.getHeight());
        miImagen.draw(canvas);

        //Pincel
        Paint pincel = new Paint();

        //Dibujo
        //Cabeza
        pincel.setColor(Color.rgb(218,152,102)); // color RGB
        pincel.setStyle(Paint.Style.FILL); //Relleno/Contorno
        canvas.drawRect(resX/2-200, resY/4-200, resX/2+200, resY/4+200, pincel);

        //Pelo
        pincel.setColor(Color.rgb(92,60,35)); // color RGB
        canvas.drawRect(resX/2-200, resY/4-200, resX/2+200, resY/4-100, pincel);
        canvas.drawRect(resX/2-200, resY/4-200, resX/2-150, resY/4-50, pincel);
        canvas.drawRect(resX/2+150, resY/4-200, resX/2+200, resY/4-50, pincel);
        //Ojos
        pincel.setColor(Color.rgb(255,255,255)); // color RGB
        canvas.drawRect(resX/2-150, resY/4-30, resX/2-50, resY/4+20, pincel);
        canvas.drawRect(resX/2+50, resY/4-30, resX/2+150, resY/4+20, pincel);
        pincel.setColor(Color.rgb(87, 58, 138)); // color RGB
        canvas.drawRect(resX/2-100, resY/4-30, resX/2-50, resY/4+20, pincel);
        canvas.drawRect(resX/2+50, resY/4-30, resX/2+100, resY/4+20, pincel);
        //Nariz
        pincel.setColor(Color.rgb(164, 90, 61)); // color RGB
        canvas.drawRect(resX/2-50, resY/4+20, resX/2+50, resY/4+70, pincel);
        //Boca
        pincel.setColor(Color.rgb(92, 60, 35)); // color RGB
        canvas.drawRect(resX/2-100, resY/4+70, resX/2-50, resY/4+120, pincel);
        canvas.drawRect(resX/2+50, resY/4+70, resX/2+100, resY/4+120, pincel);
        canvas.drawRect(resX/2-100, resY/4+120, resX/2+100, resY/4+170, pincel);

        //Playera
        pincel.setColor(Color.rgb(21, 191, 188)); // color RGB
        canvas.drawRect(resX/2-400, resY/4+200, resX/2+400, resY/4+800, pincel);
        //Brazos
        pincel.setColor(Color.rgb(218, 152, 102)); // color RGB
        canvas.drawRect(resX/2-400, resY/4+400, resX/2-200, resY/4+800, pincel);
        canvas.drawRect(resX/2+200, resY/4+400, resX/2+400, resY/4+800, pincel);

        //Pantalon
        pincel.setColor(Color.rgb(13, 113, 173)); // color RGB
        canvas.drawRect(resX/2-200, resY/4+800, resX/2+200, resY/4+1400, pincel);

        //Zapatos
        pincel.setColor(Color.rgb(107, 107, 107)); // color RGB
        canvas.drawRect(resX/2-200, resY/4+1400, resX/2+200, resY/4+1500, pincel);

        // Mostrar el dibujo en el lienzo
        miDibujo.draw(canvas);
    }
}