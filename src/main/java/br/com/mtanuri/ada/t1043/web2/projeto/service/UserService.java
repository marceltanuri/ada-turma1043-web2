package br.com.mtanuri.ada.t1043.web2.projeto.service;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.UserDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.User;

import java.util.List;

public interface UserService {
    User insertUser(UserDTO userDTO);
    List<User> getAllUsers();
}
