package br.com.mtanuri.ada.t1043.web2.projeto.user;

import br.com.mtanuri.ada.t1043.web2.projeto.user.dto.request.CreateUserDto;
import br.com.mtanuri.ada.t1043.web2.projeto.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "users")
@Tag(name = "Users", description = "Manage the users")
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;

    @GetMapping
    @Operation(summary = "Get all users", description = "Return all users saved")
    public List<User> getUsers() {
        return this.userService.findAll();
    }

    @PostMapping
    @Operation(summary = "Create new user", description = "Create and save a new user")
    public User postUser(@RequestBody @Valid CreateUserDto createUserDto) {
        User user = this.modelMapper.map(createUserDto, User.class);
        return this.userService.save(user);
    }
}
