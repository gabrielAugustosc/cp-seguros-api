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

import com.github.gabrielAugustosc.api.seguros.models.Auto;
import com.github.gabrielAugustosc.api.seguros.repository.AutoRepository;

@RestController
@RequestMapping("/auto")
public class AutoController {

    @Autowired
    private AutoRepository repository;

    @PostMapping
    public ResponseEntity<Auto> create(@RequestBody Auto auto) {         
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(auto));
    }

    @GetMapping("/{id}")    
    public ResponseEntity<Auto> findById(@PathVariable Long id) { 
        return repository
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());        
    }

    @GetMapping    
    public ResponseEntity<List<Auto>> findAll() {        
        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Auto> update(@PathVariable Long id, 
                                @RequestBody Auto auto) {

        Optional<Auto> optAuto = repository.findById(id);

        if (optAuto.isPresent()) {
            auto.setId(id);
            Auto autoAlterado = repository.save(auto);
            return ResponseEntity.ok(autoAlterado);
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
