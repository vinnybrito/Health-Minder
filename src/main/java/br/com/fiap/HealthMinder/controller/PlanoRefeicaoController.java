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

import br.com.fiap.HealthMinder.model.PlanoRefeicao;
import br.com.fiap.HealthMinder.repository.PlanoRefeicaoRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("plano")
public class PlanoRefeicaoController {

    @Autowired
    PlanoRefeicaoRepository repository;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody @Valid PlanoRefeicao plano) {
        log.info("Cadastrando plano - " + plano);
        repository.save(plano);
        return ResponseEntity.status(HttpStatus.CREATED).body(plano);
    }

    @GetMapping
    public List<PlanoRefeicao> index() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<PlanoRefeicao> show(@PathVariable Long id) {
        log.info("Mostrar plano com id " + id);
        return ResponseEntity.ok(getPlanoById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id) {
        log.info("Apagando plano com id " + id);
        repository.delete(getPlanoById(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<PlanoRefeicao> update(@PathVariable Long id, @RequestBody PlanoRefeicao plano) {
        log.info("Atualizando dados do usuario com id " + id);
        getPlanoById(id);
        plano.setId(id);
        repository.save(plano);

        return ResponseEntity.ok(plano);
    }

    private PlanoRefeicao getPlanoById(Long id) {
        return repository.findById(id).orElseThrow(() -> {
            return new RuntimeException();
        });
    }

}
