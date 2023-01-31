package com.registros.registro.repository;

import com.registros.registro.entities.RegistroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository<RegistroEntity,Long> {
    RegistroEntity findById(long id);

}
