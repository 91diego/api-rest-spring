package com.dgonzalez.apirest.domain.repository;

import com.dgonzalez.apirest.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAll();
    Optional<List<User>> getUser(int id);
    User save(User user);
}