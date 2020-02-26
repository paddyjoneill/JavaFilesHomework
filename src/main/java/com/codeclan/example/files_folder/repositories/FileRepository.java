package com.codeclan.example.files_folder.repositories;

import com.codeclan.example.files_folder.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
