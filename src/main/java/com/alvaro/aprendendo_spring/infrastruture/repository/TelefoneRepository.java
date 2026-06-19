package com.alvaro.aprendendo_spring.infrastruture.repository;

import com.alvaro.aprendendo_spring.infrastruture.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
