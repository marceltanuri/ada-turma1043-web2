package br.com.mtanuri.ada.t1043.web2.projeto.respository;

import br.com.mtanuri.ada.t1043.web2.projeto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findByEmail(String email);

}
