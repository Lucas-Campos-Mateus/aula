package com.camadasomrdto.aula.dto;

import com.camadasomrdto.aula.model.User;

public class UserDTO { //3º Criamos o DTO (Data transfer objects) DTO copia os dados da entidade para entregar para o exterior
    private Long id;
    private String name;

    public UserDTO(){
    }

    public UserDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
