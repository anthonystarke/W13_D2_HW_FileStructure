package com.codeclan.example.folders.Repositories;

import com.codeclan.example.folders.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Long> {
}
