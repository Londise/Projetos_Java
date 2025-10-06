package br.com.fiap.controller;

import br.com.fiap.model.dto.RemedioDTO;
import br.com.fiap.model.entity.Remedio;
import br.com.fiap.model.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drogaria")
public class RemedioController {
    @Autowired
    private RemedioRepository remedioRepository;

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody RemedioDTO remedioDTO) {
        try {
            Remedio remedio = new Remedio(remedioDTO);
            remedioRepository.save(remedio);
            return ResponseEntity.status(HttpStatus.CREATED).body(remedio); // 201
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao salvar o remédio");
        }
    }
}
