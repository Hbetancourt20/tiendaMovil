package com.example.tiendaonline.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Producto {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nombre;
    public double precio;
    public String descripcion;
    public String imagenUri; // Ruta de la imagen tomada con la cámara
}