package br.com.mtanuri.ada.t1043.web2.projeto.service;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.UserDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.User;
import br.com.mtanuri.ada.t1043.web2.projeto.respository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    public User insertUser(UserDTO userDTO) {
        User user = new User(userDTO.getName(), userDTO.getCpf(), userDTO.getEmail(), userDTO.getAddress());
        return this.userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}
