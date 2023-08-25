package br.com.mtanuri.ada.t1043.web2.projeto.User;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;



    @PostMapping
    public UserModel addUser(@RequestBody UserModel userModel){
        return userRepository.save(userModel);
    }


    @GetMapping()
    public List<UserModel> getUsers(){
        return userRepository.findAll();
    }


}
