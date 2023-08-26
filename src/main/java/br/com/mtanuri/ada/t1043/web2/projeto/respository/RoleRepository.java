package br.com.mtanuri.ada.t1043.web2.projeto.respository;

import br.com.mtanuri.ada.t1043.web2.projeto.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
