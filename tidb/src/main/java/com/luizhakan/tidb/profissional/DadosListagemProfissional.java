package com.luizhakan.tidb.profissional;

import com.luizhakan.tidb.endereco.Endereco;

public record DadosListagemProfissional(Long id, String nome, String email, String registro,
                                        Especidalidade especialidade, String telefone, Endereco endereco) {
    public DadosListagemProfissional(Profissional profissional) {
        this(profissional.getId(), profissional.getNome(), profissional.getEmail(), profissional.getRegistro(),
                profissional.getEspecialidade(), profissional.getTelefone(), profissional.getEndereco());
    }
}
