package com.dgonzalez.apirest.persistence.crud;

import com.dgonzalez.apirest.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
}
