package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { //extends atributos que se tienen

    @Override
    protected void onCreate(Bundle savedInstanceState) { //protegida funcion oncreate creacion de actividad "activity_main" //bundle es una funcion
        super.onCreate(savedInstanceState); // una funcion que crea saveInsta //super llama al objeto .oncreate //saveInsta guarda los cambios
        setContentView(R.layout.activity_main); //ayuda a incializar //es la encargada de juntar la logica y el diseño

        Toast.makeText(this, "OnCreate", Toast.LENGTH_LONG).show(); //mostrar notificacion //make mostrar //toast //context actividad actual //text texto //length_short notificacion corta
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStar", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_LONG).show();

    }


}