package com.example.aula.Repository;

import com.example.aula.Entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCarro extends JpaRepository<Carro, Long> {
}
