package com.gabrieldolabela.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrieldolabela.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    User findByUsername(String username);
}
