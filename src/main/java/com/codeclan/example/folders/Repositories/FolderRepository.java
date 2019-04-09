package com.codeclan.example.folders.Repositories;

import com.codeclan.example.folders.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder,Long> {
}
