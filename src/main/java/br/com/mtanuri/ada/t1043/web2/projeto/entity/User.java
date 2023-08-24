package br.com.mtanuri.ada.t1043.web2.projeto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String cpf;
    private String email;
    //private Address address;

    public User(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    /*
    public User(String name, String cpf, String email, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.address = address;
    }
    */
}
