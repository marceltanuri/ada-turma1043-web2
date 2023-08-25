package br.com.mtanuri.ada.t1043.web2.projeto.usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findById(Long id);
    Usuario addUsuario(UsuarioDTO usuarioDTO);
    void deleteUsuario(Long id);
    Usuario updateUsuario(Long id, UsuarioDTO usuarioDTO);
}
