package br.com.mtanuri.ada.t1043.web2.projeto.User;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
import java.util.UUID;


@Entity
@Data
@Table(name = "user_registration")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String email;
    @Column(nullable = false)
    private String password;
    private String cpf;
    private String address;
    private LocalDate birthday;


    public UserModel() {
    }


}
