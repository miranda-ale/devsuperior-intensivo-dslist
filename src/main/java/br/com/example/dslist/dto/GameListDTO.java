package br.com.example.dslist.dto;

import br.com.example.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    private GameListDTO(){

    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
