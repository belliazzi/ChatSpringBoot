package com.dbelliazzi.chat.model;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MessageRepository extends CrudRepository<Messagerepo, Long> {

	Optional<Messagerepo> findById(Long id);   
    
    
}