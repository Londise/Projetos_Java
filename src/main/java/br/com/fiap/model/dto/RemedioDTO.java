package br.com.fiap.model.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record RemedioDTO(
        @NotBlank
        String nome,
        @NotNull
        @PositiveOrZero
        Double preco,
        @PastOrPresent
        LocalDate dataDeFabricacao,
        @FutureOrPresent
        LocalDate dataDeValidade,
        String urlImagem
) {
}
