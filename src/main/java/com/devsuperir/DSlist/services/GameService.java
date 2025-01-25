package com.devsuperir.DSlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperir.DSlist.dto.GameDto;
import com.devsuperir.DSlist.dto.GameMinDto;
import com.devsuperir.DSlist.entities.Game;
import com.devsuperir.DSlist.repositories.GameRepository;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly=true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        // Implementar tratamento de exceção
        GameDto dto = new GameDto(result);
        return dto;
    }

    @Transactional(readOnly=true)
    public List<GameMinDto> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }

}
