package com.devsuperir.DSlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperir.DSlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
