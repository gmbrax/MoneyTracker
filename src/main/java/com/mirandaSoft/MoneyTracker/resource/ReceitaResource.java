package com.mirandaSoft.MoneyTracker.resource;

import com.mirandaSoft.MoneyTracker.model.Receita;
import com.mirandaSoft.MoneyTracker.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/Receitas")
public class ReceitaResource {
    @Autowired
    ReceitaService receitaService;

    @GetMapping("")
    public ResponseEntity<?> ObterReceitas(){
        ArrayList<Receita> receitas = receitaService.getAllReceitas();
        if (receitas.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sem Receitas Cadastrados");
        }
        return ResponseEntity.ok(receitas);
    }

    @GetMapping("{receitaID}")
    public ResponseEntity<?> obterReceitaPorID(@PathVariable Integer receitaID){
        return ResponseEntity.ok(receitaService.getReceitaByID(receitaID));


    }

}
