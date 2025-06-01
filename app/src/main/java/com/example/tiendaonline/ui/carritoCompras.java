package com.example.tiendaonline.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tiendaonline.R;

public class carritoCompras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_carrito_compras);
    }
    public void aceptarComprar(View view) {
        Intent intent = new Intent(this, productos.class);
        startActivity(intent);
    }
}