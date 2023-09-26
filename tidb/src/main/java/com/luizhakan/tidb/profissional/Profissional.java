package com.luizhakan.tidb.profissional;

import com.luizhakan.tidb.endereco.Endereco;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "profissional")
@Entity(name = "profissional")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Profissional {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String registro;
    @Enumerated(EnumType.STRING)
    private Especidalidade especialidade;
    @Embedded
    private Endereco endereco;
    private boolean ativo = true;

    public Profissional (DadosCadastroProfissional dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.registro = dados.registro();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

    public void alterarInformacoes(@Valid DadosAtualizacaoProfissional dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.id() != null) {
            this.id = dados.id();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.email() != null) {
            this.email = dados.email();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
