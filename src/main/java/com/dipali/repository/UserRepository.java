package com.dipali.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dipali.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
