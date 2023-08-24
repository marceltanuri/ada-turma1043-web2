package br.com.mtanuri.ada.t1043.web2.projeto.controller;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.UserDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.User;
import br.com.mtanuri.ada.t1043.web2.projeto.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<User> insertUser(@RequestBody UserDTO userDTO) {
        User user = this.userService.insertUser(userDTO);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
