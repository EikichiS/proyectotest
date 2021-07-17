package com.example.proyectotest.models.service;

import java.util.List;

import com.example.proyectotest.models.entity.Producto;

public interface IProductoService {
    
    public List<Producto> findAll();
    public Producto findbyId(Long id);
}
