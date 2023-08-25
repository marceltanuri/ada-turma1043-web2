package br.com.mtanuri.ada.t1043.web2.projeto.users.controller;

import br.com.mtanuri.ada.t1043.web2.projeto.users.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;
}
