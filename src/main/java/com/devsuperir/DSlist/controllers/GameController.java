package com.devsuperir.DSlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperir.DSlist.dto.GameDto;
import com.devsuperir.DSlist.dto.GameMinDto;
import com.devsuperir.DSlist.services.GameService;

@RestController
@RequestMapping(value = "/games") // Define o endpoint base como "/games"
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping 
    public List<GameMinDto> findAll() {
        List<GameMinDto> result = gameService.findAll();
        return result;
    }

    @GetMapping(value="/{id}")
    public GameDto findById(@PathVariable long id){
        GameDto result = gameService.findById(id);
        return result;
    }
}
