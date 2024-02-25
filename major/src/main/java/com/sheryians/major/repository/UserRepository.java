package com.sheryians.major.repository;

import com.sheryians.major.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{
    
}
