package de.awacademy.begruessung;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BeitragRepository extends CrudRepository<Beitrag, Integer> {

    List<Beitrag> findAll();
}