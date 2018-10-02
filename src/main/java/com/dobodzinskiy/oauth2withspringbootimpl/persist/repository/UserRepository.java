package com.dobodzinskiy.oauth2withspringbootimpl.persist.repository;

import com.dobodzinskiy.oauth2withspringbootimpl.persist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT (CASE WHEN exists (SELECT id FROM account a WHERE a.email = ?1) THEN FALSE ELSE TRUE END)", nativeQuery = true)
    boolean isEmailUnique(String email);

    @Query(value = "SELECT (CASE WHEN exists (SELECT id FROM account a WHERE a.username = ?1) THEN FALSE ELSE TRUE END)", nativeQuery = true)
    boolean isUsernameUnique(String username);

    Optional<User> findByUsername(String username);

}