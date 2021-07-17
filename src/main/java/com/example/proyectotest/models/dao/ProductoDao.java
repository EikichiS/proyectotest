package com.example.proyectotest.models.dao;

import com.example.proyectotest.models.entity.Producto;

import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository <Producto, Long> {
    
}
