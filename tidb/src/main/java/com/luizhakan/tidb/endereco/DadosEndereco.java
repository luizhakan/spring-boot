package com.luizhakan.tidb.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        String uf,
        String complemento,
        @NotBlank @Pattern(regexp = "\\d{10}")
        String cep,
        String numero
) {
}
