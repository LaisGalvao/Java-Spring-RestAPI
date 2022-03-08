package com.example.userdept.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
