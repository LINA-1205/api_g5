package com.example.ServidorSura5.repositorios;

import com.example.ServidorSura5.modelos.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@RepositoryS
public interface IRepositorioMedico extends JpaRepository <Medico,Long> {
}
