package com.github.gabrielAugustosc.api.seguros.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.gabrielAugustosc.api.seguros.models.Residencia;
import com.github.gabrielAugustosc.api.seguros.repository.ResidenciaRepository;

@RestController
@RequestMapping("/residencia")
public class ResidenciaController {

    @Autowired
    private ResidenciaRepository repository;

    @PostMapping
    public ResponseEntity<Residencia> create(@RequestBody Residencia residencia) {         
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(residencia));
    }

    @GetMapping("/{id}")    
    public ResponseEntity<Residencia> findById(@PathVariable Long id) { 
        return repository
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());        
    }

    @GetMapping    
    public ResponseEntity<List<Residencia>> findAll() {        
        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Residencia> update(@PathVariable Long id, 
                                @RequestBody Residencia residencia) {

        Optional<Residencia> optResidencia = repository.findById(id);

        if (optResidencia.isPresent()) {
            residencia.setId(id);
            Residencia residenciaAlterada = repository.save(residencia);
            return ResponseEntity.ok(residenciaAlterada);
        } else {
            return ResponseEntity.notFound().build();
        }     
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) { 
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
 
    }
}
