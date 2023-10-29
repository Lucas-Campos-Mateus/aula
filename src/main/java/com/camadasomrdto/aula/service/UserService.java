package com.camadasomrdto.aula.service;

import com.camadasomrdto.aula.dto.UserDTO;
import com.camadasomrdto.aula.model.User;
import com.camadasomrdto.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService { //4º Criamos a classe service que lida com as operações de negócio (Salvar, verificar, baixar estoque, enviar email e etc)

    @Autowired
    //Com essa anotação o próprio framework vai tratar de resolver depêndencia e entregar o objeto que podemos usar
    private UserRepository repository; //temos que injetar uma dependência do UserRepository

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) { //Essa classe fica responsável por receber um ID

        User entity = repository.findById(id).get(); // Ela vai no banco de dados e busta o User por esse ID do BD
        //          ^
        //para transformar o User em UserDTO, podemos usar o construtor da classe UserDTO
        //          v
        UserDTO dto = new UserDTO(entity); // Passando a Entidade aqui de cima
        return dto;  //Depois ela retorna esse usuário transformado para objeto DTO
    }
}
