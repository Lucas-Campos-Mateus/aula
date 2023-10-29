package com.camadasomrdto.aula.controller;

import com.camadasomrdto.aula.dto.UserDTO;
import com.camadasomrdto.aula.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController { //5º Criar o controlador que ficará responsável pelas requisições HTTP

    @Autowired //Framework fica responsável por injetar esse cara aqui
    private UserService service; //Temos que injetar dependências service aqui também

    @GetMapping(value = "/{id}")//e para configurar que esse ID que chegar na requisição tem que
    public UserDTO findById(@PathVariable Long id){// casar com esse id do argumento do método, temos que colocar o @PathVariable
        return service.findById(id);
    }
}
