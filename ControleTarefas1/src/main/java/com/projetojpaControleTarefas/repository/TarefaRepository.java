package com.projetojpaControleTarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpaControleTarefas.entitie.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}
