package com.mirandaSoft.MoneyTracker.service;

import com.mirandaSoft.MoneyTracker.model.Receita;
import com.mirandaSoft.MoneyTracker.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;


    public  ArrayList<Receita> getAllReceitas() {
        return (ArrayList<Receita>) receitaRepository.findAll();
    }

    public Receita getReceitaByID(Integer receitaID) {
        return receitaRepository.getReferenceById(receitaID);
    }
}
