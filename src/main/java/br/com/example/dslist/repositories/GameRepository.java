package br.com.example.dslist.repositories;

import br.com.example.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// Camada de acesso aos dados

public interface GameRepository extends JpaRepository<Game, Long> {



}
