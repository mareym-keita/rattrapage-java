package com.ism.services.impl;

import com.ism.data.models.Bien;
import com.ism.repository.IBienRepository;
import com.ism.services.IBienService;

import java.util.List;

public class BienServiceImpl implements IBienService {
    private final IBienRepository bienRepository;

    public BienServiceImpl(IBienRepository bienRepository) {
        this.bienRepository = bienRepository;
    }

    @Override
    public Bien save(Bien bien) {
        return bienRepository.save(bien);
    }

    @Override
    public Bien findById(int id) {
        return bienRepository.findById(id);
    }

    @Override
    public List<Bien> findAll() {
        return bienRepository.findAll();
    }

    @Override
    public void update(Bien entity) {

    }

    @Override
    public void delete(Bien entity) {

    }

    @Override
    public void deleteById(int id) {

    }
}
