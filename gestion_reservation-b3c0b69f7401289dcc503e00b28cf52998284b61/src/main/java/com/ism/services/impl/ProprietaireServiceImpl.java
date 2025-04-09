package com.ism.services.impl;

import com.ism.data.models.Proprietaire;
import com.ism.repository.IProprietaireRepository;
import com.ism.services.IProprietaireService;

import java.util.List;

public class ProprietaireServiceImpl implements IProprietaireService {
    private final IProprietaireRepository proprietaireRepository;

    public ProprietaireServiceImpl(IProprietaireRepository proprietaireRepository) {
        this.proprietaireRepository = proprietaireRepository;
    }

    @Override
    public Proprietaire save(Proprietaire entity) {
        return null;
    }

    @Override
    public Proprietaire findById(int id) {
        return null;
    }

    @Override
    public List<Proprietaire> findAll() {
        return List.of();
    }

    @Override
    public void update(Proprietaire entity) {

    }

    @Override
    public void delete(Proprietaire entity) {

    }

    @Override
    public void deleteById(int id) {

    }
}
