package br.com.mtanuri.ada.t1043.web2.projeto.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}