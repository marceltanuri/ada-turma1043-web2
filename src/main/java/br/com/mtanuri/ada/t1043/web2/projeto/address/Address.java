package br.com.mtanuri.ada.t1043.web2.projeto.address;

import br.com.mtanuri.ada.t1043.web2.projeto.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String zipCode;
    @Column
    private String street;
    @Column
    private String neighborhood;
    @Column
    private String city;
    @Column(length = 2)
    private String state;
}
