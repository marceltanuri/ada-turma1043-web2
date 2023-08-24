package br.com.mtanuri.ada.t1043.web2.projeto.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Data
@Table(name = "user_registration")
public class UserModel {
    @Id
    private Long id;
    private String email;
    private String password;
    private String cpf;
    private String address;
    private LocalDate birthday;


    public UserModel(String email, String password, String cpf, String address, LocalDate birthday){
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.address = address;
        this.birthday = birthday;

    }

    public UserModel() {
    }


}
