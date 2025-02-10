package br.com.josecampelo.CadastroDePersonagens.Repository;

import br.com.josecampelo.CadastroDePersonagens.Model.PersonagemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonagemRepository extends JpaRepository<PersonagemModel, Long> {
}