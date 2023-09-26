package com.luizhakan.tidb.profissional;


import com.luizhakan.tidb.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroProfissional(
        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank @Pattern(regexp = "\\d{9}")
        String registro,
        @NotNull
        Especidalidade especialidade,
        @NotNull @Valid
        DadosEndereco endereco
) {
}
