package br.com.mtanuri.ada.t1043.web2.projeto.usuario;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
        var usuarios = usuarioService.findAll();
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("{id}")
    public ResponseEntity<Usuario> findById(@PathVariable String id){
        var usuario = usuarioService.findById(Long.parseLong(id));
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public ResponseEntity saveUsuario(@RequestBody UsuarioDTO usuario, UriComponentsBuilder uriBuilder){
        var novoUsuario = usuarioService.addUsuario(usuario);
        var uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(novoUsuario.getId()).toUri();
        return ResponseEntity.created(uri).body(usuario);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteUsuario(@PathVariable String id){
        usuarioService.deleteUsuario(Long.parseLong(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable String id, @RequestBody UsuarioDTO usuario){
        var updatedUsuario = usuarioService.updateUsuario(Long.parseLong(id), usuario);
        return ResponseEntity.ok(updatedUsuario);
    }

}

