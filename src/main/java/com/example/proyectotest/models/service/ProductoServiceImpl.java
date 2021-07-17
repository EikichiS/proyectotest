package com.example.proyectotest.models.service;

import java.util.List;

import com.example.proyectotest.models.dao.ProductoDao;
import com.example.proyectotest.models.entity.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findbyId(Long id) {
        return productoDao.findById(id).orElse(null);
    }
    
}
