package com.example.tiendaonline.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.tiendaonline.model.Producto;

import java.util.List;

@Dao
public interface ProductoDao {
    @Insert
    void insertar(Producto producto);

    @Update
    void actualizar(Producto producto);

    @Delete
    void eliminar(Producto producto);

    @Query("SELECT * FROM Producto")
    List<Producto> obtenerTodos();
}
