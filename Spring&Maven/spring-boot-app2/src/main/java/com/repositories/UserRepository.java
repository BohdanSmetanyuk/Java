package com.repositories;

import com.entities.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
