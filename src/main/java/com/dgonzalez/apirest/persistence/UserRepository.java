package com.dgonzalez.apirest.persistence;

import com.dgonzalez.apirest.persistence.crud.ProfileCrudRepository;
import com.dgonzalez.apirest.persistence.crud.UserCrudRepository;
import com.dgonzalez.apirest.persistence.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private UserCrudRepository userCrudRepository;
    private ProfileCrudRepository profileCrudRepository;

    /**
     * Gets all users information
     * @return User
     */
    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    /**
     * Save new user
     * @param user
     * @return
     */
    public User save(User user) {
        return userCrudRepository.save(user);
    }
}
