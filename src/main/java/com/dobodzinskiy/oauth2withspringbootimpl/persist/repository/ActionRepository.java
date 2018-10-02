package com.dobodzinskiy.oauth2withspringbootimpl.persist.repository;

import com.dobodzinskiy.oauth2withspringbootimpl.persist.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action, Long> {

}
