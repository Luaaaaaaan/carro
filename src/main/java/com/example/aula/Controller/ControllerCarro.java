package com.example.aula.Controller;

import com.example.aula.Entity.Carro;
import com.example.aula.Service.ServiceCarro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class ControllerCarro {

    @Autowired
    private ServiceCarro serviceCarro;

    @RequestMapping("/save")
    public ResponseEntity<Carro> Salvar(@RequestBody Carro carro){
        try{
            return new ResponseEntity<>(serviceCarro.save(carro), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}

