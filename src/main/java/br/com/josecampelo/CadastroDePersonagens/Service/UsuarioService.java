package br.com.josecampelo.CadastroDePersonagens.Service;

import br.com.josecampelo.CadastroDePersonagens.Model.UsuarioModel;
import br.com.josecampelo.CadastroDePersonagens.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioModel adicionaUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public List<UsuarioModel> listarUsuarios(){
        return usuarioRepository.findAll();
    }
}