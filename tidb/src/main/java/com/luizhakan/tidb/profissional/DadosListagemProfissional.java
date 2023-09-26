package com.luizhakan.tidb.profissional;

public record DadosListagemProfissional(Long id, String nome, String email, String registro, Especidalidade especialidade) {
    public DadosListagemProfissional (Profissional profissional) {
        this(profissional.getId(), profissional.getNome(), profissional.getEmail(), profissional.getRegistro(), profissional.getEspecialidade());
    }
}
