package com.codeclan.example.folders.Repositories;

import com.codeclan.example.folders.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
