package br.com.mtanuri.ada.t1043.web2.projeto.attachments.repository;

import br.com.mtanuri.ada.t1043.web2.projeto.attachments.model.Attachments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentsRepository extends JpaRepository<String, Attachments> {
}
