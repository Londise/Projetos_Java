package br.com.fiap.model.dto;

import java.time.LocalDate;

public record RemedioDTO(
    String nome,
    Double preco,
    LocalDate dataDeFabricacao,
    LocalDate dataDeValidade,
    String urlImagem
) {}
