package com.repositories;

import org.springframework.data.repository.CrudRepository;
import com.entities.Secret;

public interface SecretRepository extends CrudRepository<Secret, Long> {

}