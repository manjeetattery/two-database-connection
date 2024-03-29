package com.example.repo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model1.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
