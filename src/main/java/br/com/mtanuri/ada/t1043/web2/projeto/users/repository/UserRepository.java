package br.com.mtanuri.ada.t1043.web2.projeto.users.repository;

import br.com.mtanuri.ada.t1043.web2.projeto.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<String, User> {
}
