package br.com.mtanuri.ada.t1043.web2.projeto.usuario;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> findAll() {
//        return usuarioRepository.findAllUsuariosWithEndereco();
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public Usuario addUsuario(UsuarioDTO usuarioDTO) {
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(usuarioDTO.nome());
        novoUsuario.setCpf(usuarioDTO.cpf());
        novoUsuario.setEmail(usuarioDTO.email());
        novoUsuario.setEndereco(usuarioDTO.endereco());
        return usuarioRepository.save(novoUsuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario updateUsuario(Long id, UsuarioDTO usuarioDTO) {
        Usuario usuario = findById(id);
        usuario.setNome(usuarioDTO.nome());
        usuario.setCpf(usuarioDTO.cpf());
        usuario.setEmail(usuarioDTO.email());
        usuario.setEndereco(usuarioDTO.endereco());
        return usuarioRepository.save(usuario);
    }
}

