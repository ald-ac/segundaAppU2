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
                        Toast.makeText(getApplicationContext(), "Repro video", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Touch y sonido", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "animacion", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "canvas", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(), "gestures", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}