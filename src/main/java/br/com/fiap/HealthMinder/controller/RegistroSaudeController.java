package br.com.fiap.HealthMinder.controller;

import java.util.List;
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

import br.com.fiap.HealthMinder.model.RegistroSaude;
import br.com.fiap.HealthMinder.repository.RegistroSaudeRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("registro")
public class RegistroSaudeController {


    @Autowired
    RegistroSaudeRepository repository;

    @GetMapping
    public List<RegistroSaude> index() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody @Valid RegistroSaude registro) {
        log.info("Cadastrando usuario - " + registro);
        repository.save(registro);
        return ResponseEntity.status(HttpStatus.CREATED).body(registro);
    }

    @GetMapping("{id}")
    public ResponseEntity<RegistroSaude> show(@PathVariable Long id) {
        log.info("Mostrar usuario com id " + id);
        return ResponseEntity.ok(getRegistroById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id) {
        log.info("Apagando usuario com id " + id);
        repository.delete(getRegistroById(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<RegistroSaude> update(@PathVariable Long id, @RequestBody RegistroSaude registro) {
        log.info("Atualizando dados do usuario com id " + id);
        getRegistroById(id);
        registro.setId(id);
        repository.save(registro);

        return ResponseEntity.ok(registro);
    }

    private RegistroSaude getRegistroById(Long id) {
        return repository.findById(id).orElseThrow(() -> {
            return new RuntimeException();
        });
    }
    
}
