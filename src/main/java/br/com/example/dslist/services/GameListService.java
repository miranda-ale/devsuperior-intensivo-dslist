package br.com.example.dslist.services;

import br.com.example.dslist.dto.GameListDTO;
import br.com.example.dslist.dto.GameMinDTO;
import br.com.example.dslist.entities.Game;
import br.com.example.dslist.entities.GameList;
import br.com.example.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;

    };

}
