package com.camadasomrdto.aula.repository;

import com.camadasomrdto.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { //2º criamos o repositório (Faz a conexão com o banco de dados)

}
