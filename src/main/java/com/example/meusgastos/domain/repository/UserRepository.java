package com.example.meusgastos.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meusgastos.domain.model.Usuario;
import java.util.List;

public interface UserRepository extends JpaRepository<Usuario, String> {
    List<Usuario> findByEmail(String email);
}
