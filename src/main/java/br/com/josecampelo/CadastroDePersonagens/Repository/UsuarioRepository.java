package br.com.josecampelo.CadastroDePersonagens.Repository;

import br.com.josecampelo.CadastroDePersonagens.Model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}