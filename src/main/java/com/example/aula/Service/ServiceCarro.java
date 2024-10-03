package com.example.aula.Service;

import com.example.aula.Entity.Carro;
import com.example.aula.Repository.RepositoryCarro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCarro {

    @Autowired
    private RepositoryCarro repositoryCarro;

    public Carro save(Carro carro){
     return repositoryCarro.save(carro);
    }
}
