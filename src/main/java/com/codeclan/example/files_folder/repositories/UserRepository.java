package com.codeclan.example.files_folder.repositories;

import com.codeclan.example.files_folder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
