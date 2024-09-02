package com.riwi.RiwiMultimedia.services.impl;

import com.riwi.RiwiMultimedia.entities.Class;
import com.riwi.RiwiMultimedia.repositories.interfaces.ClassesRepository;
import com.riwi.RiwiMultimedia.services.interfaces.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClassImpl implements IClassService {

    @Autowired
    ClassesRepository classesRepository;

    @Override
    public Class readByDescription(String descripcion) {
        return classesRepository.findByDescription(descripcion);
    }

    @Override
    public Class readByName(String nombre) {
        return classesRepository.findByName(nombre);
    }

    @Override
    public Page<Class> readByPages(Pageable pageable) {
        return classesRepository.findAll(pageable);
    }

    @Override
    public Class create(Class claseEscolar) {
        return classesRepository.save(claseEscolar);
    }

    @Override
    public Class readById(Integer id) {
        return classesRepository.findById(id).orElse(null);
    }
}
