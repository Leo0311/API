package com.registros.registro.repository;

import com.registros.registro.entities.RegistroEntityEndereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<RegistroEntityEndereco,Long> {
}
