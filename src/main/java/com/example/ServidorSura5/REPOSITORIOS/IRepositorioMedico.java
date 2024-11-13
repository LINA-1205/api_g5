package com.example.ServidorSura5.REPOSITORIOS;

import com.example.ServidorSura5.MODELOS.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryS
public interface IRepositorioMedico extends JpaRepository <Medico,Long> {
}
