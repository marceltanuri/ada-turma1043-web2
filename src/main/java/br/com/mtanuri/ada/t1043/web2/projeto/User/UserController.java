package br.com.mtanuri.ada.t1043.web2.projeto.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping
    public UserModel addUser(@RequestBody UserModel userModel){
        return userRepository.save(userModel);
    }


    @GetMapping()
    public List<UserModel> getUsers(){
        return userRepository.findAll();
    }


}
