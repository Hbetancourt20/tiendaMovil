package com.example.tiendaonline.ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;

import com.example.tiendaonline.R;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void loginButtonClicked(View view) {
        Intent intent = new Intent(this, productos.class);
        startActivity(intent);
    }

    public void registerButtonClicked(View view) {
        Intent intent = new Intent(this, registroUsuario.class);
        startActivity(intent);
    }
}