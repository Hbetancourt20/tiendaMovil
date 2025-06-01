package com.example.tiendaonline.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.tiendaonline.dao.ProductoDao;
import com.example.tiendaonline.dao.UsuarioDao;
import com.example.tiendaonline.model.Producto;
import com.example.tiendaonline.model.Usuario;

@Database(entities = {Producto.class, Usuario.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ProductoDao productoDao();
    public abstract UsuarioDao usuarioDao();
}
