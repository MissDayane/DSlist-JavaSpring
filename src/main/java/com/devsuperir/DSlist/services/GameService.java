package com.devsuperir.DSlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.devsuperir.DSlist.dto.GameMinDto;
import com.devsuperir.DSlist.entities.Game;
import com.devsuperir.DSlist.repositories.GameRepository;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public List<GameMinDto> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }

}
