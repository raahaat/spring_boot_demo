package com.example.demo.repository;

import com.example.demo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthorRepo extends JpaRepository<Author, Integer> {
}
