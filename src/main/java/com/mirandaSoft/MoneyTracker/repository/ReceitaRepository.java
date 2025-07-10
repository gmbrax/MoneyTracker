package com.mirandaSoft.MoneyTracker.repository;

import com.mirandaSoft.MoneyTracker.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Integer> {
}
