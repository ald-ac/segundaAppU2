package com.appsmoviles.segundaappu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //GUI
    ListView lvMenu;

    String[] items = {"Reproductor musical", "Reproductor de video", "Efectos touch y sonido", "Animacion", "Dibujo en canvas", "Gestures"};
    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMenu = findViewById(R.id.lv_menu);

        adapterItems = new ArrayAdapter<String>(this, R.layout.list_view_item, items);
        lvMenu.setAdapter(adapterItems);

        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getApplicationContext(), MusicaActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), VideoActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), TouchSonidoActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), AnimacionActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(), CanvasActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(getApplicationContext(), GesturesActivity.class));
                        break;
                }
            }
        });
    }
}