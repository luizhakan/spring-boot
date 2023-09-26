package com.luizhakan.tidb.controller;

import com.luizhakan.tidb.profissional.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profissional")
public class ProfissionalController {

    @Autowired
    private ProfissionalRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroProfissional dados) {
        repository.save(new Profissional(dados));
    }

    @GetMapping
    public Page<DadosListagemProfissional> listar(@PageableDefault(size = 5, page = 0, sort = {"nome"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemProfissional::new);
    }

    @PutMapping
    @Transactional
    public void alterar(@RequestBody @Valid DadosAtualizacaoProfissional dados) {
        var profissional = repository.getReferenceById(dados.id());
        profissional.alterarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var profissional = repository.getReferenceById(id);
        profissional.excluir();
    }
}
