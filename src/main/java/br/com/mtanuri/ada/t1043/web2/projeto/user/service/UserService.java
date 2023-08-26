package br.com.mtanuri.ada.t1043.web2.projeto.user.service;

import br.com.mtanuri.ada.t1043.web2.projeto.user.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User find(Long userId);

    User save(User user);

    User delete(User user);
}
