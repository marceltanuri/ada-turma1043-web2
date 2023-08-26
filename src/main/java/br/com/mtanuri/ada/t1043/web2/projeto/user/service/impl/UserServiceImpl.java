package br.com.mtanuri.ada.t1043.web2.projeto.user.service.impl;

import br.com.mtanuri.ada.t1043.web2.projeto.user.User;
import br.com.mtanuri.ada.t1043.web2.projeto.user.UserRepository;
import br.com.mtanuri.ada.t1043.web2.projeto.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User find(Long userId) {
        return this.userRepository.findById(userId).orElseThrow(RuntimeException::new);
    }

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User delete(User user) {
        this.userRepository.delete(user);
        return user;
    }
}
