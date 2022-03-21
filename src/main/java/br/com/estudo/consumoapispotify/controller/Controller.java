package br.com.estudo.consumoapispotify.controller;

import br.com.estudo.consumoapispotify.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ServiceImpl service;

    @GetMapping(value = "/{user_id}")
    public ResponseEntity<?> findUserDetails(@PathVariable(name = "user_id") String id) {
        //implementar a lógica
        return null;
    }


}
