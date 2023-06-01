package com.LockBox.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LockBox.models.ERole;
import com.LockBox.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
