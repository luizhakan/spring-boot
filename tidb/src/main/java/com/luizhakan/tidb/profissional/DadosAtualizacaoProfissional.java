package com.luizhakan.tidb.profissional;

import com.luizhakan.tidb.endereco.DadosEndereco;

public record DadosAtualizacaoProfissional(Long id, String nome, String telefone, String email, DadosEndereco endereco) {

}
