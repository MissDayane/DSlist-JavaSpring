package com.devsuperir.DSlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperir.DSlist.entities.Game;

public interface GameRepository extends  JpaRepository<Game, Long>{

}
