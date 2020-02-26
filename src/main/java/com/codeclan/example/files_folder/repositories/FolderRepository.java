package com.codeclan.example.files_folder.repositories;

import com.codeclan.example.files_folder.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
