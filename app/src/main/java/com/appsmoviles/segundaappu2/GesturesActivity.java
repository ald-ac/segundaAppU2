package com.appsmoviles.segundaappu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

public class GesturesActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {
    private static final String TAG = "Swipe Position";
    private float x1, x2, y1, y2;
    private static int MIN_DISTANCE = 150;
    private GestureDetector gestureDetector;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestures);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        im=findViewById(R.id.imageView);
        //initialize gestureDetector
        this.gestureDetector = new GestureDetector(GesturesActivity.this, this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        switch (event.getAction()){
            // iniciando tiempo del gesto swipe
            case MotionEvent.ACTION_DOWN:
                x1=event.getX();
                y1=event.getY();
                break;
            // terminando el tiempo del gesto swipe
            case MotionEvent.ACTION_UP:
                x2=event.getX();
                y2=event.getY();

                float valueX = x2-x1;
                float valueY = y2-y1;

                if (Math.abs(valueX)> MIN_DISTANCE){
                    // detecta swipe izquierda a derecha
                    if (x2>x1)
                    {
                        im.setImageResource(R.mipmap.melo3);
                    }
                    else
                    {
                        // Detecta swipe de derecha a izquierda
                        im.setImageResource(R.mipmap.melo2);
                    }
                }
                else if (Math.abs(valueY) > MIN_DISTANCE) {
                    // Detecta abajo swipe
                    if (y2 > y1) {
                        //arriba to abajo swipe
                        im.setImageResource(R.mipmap.melo1);
                    } else {
                        // Detecta abajo arriba swipe
                        im.setImageResource(R.mipmap.melo);
                    }
                }
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}