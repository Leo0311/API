package com.registros.registro.controller;

import com.registros.registro.entities.RegistroEntity;
import com.registros.registro.entities.RegistroEntityEndereco;
import com.registros.registro.repository.EnderecoRepository;
import com.registros.registro.repository.RegistroRepository;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@Api(value ="API REST Registros")
//@CrossOrigin(origins="*")
@RestController
@RequestMapping(value ="/api")
public class RegistroController {
    //Injeção de dependência  usando o Autowired
    @Autowired
    RegistroRepository registroRepository;
    @Autowired
    EnderecoRepository enderecoRepository;

    @GetMapping("/listaRegistros")
    @ApiOperation(value = "Retorna uma lista de registros")
    public List <RegistroEntity> listaRegistros(){
       return registroRepository.findAll();
    }

    @GetMapping("/registro/{id}")
    @ApiOperation(value = "Retorna apenas um registro")
    public RegistroEntity apenasUmRegistro(@PathVariable(value = "id") long id){
        return registroRepository.findById(id);
    }

    @PostMapping("/registro")
    @ApiOperation(value = "Cadastra um novo registro")
    public RegistroEntity cadastroDeUmNovoRegistro(@RequestBody RegistroEntity registro){
        return registroRepository.save(registro);
    }

    @DeleteMapping("/registro")
    @ApiOperation(value = "Deleta um registro")
    public void deletandoUmRegistro(@RequestBody RegistroEntity registro){
        registroRepository.delete(registro);
    }

    @PutMapping("/registro")
    @ApiOperation(value = "atualiza um registro")
    public RegistroEntity atualizandoUmRegistro(@RequestBody RegistroEntity registro){
        return registroRepository.save(registro);
    }
    @GetMapping("/listaEnderecos")
    @ApiOperation(value = "Retorna uma lista de enderecos")
    public List <RegistroEntityEndereco> listaEnderecos(){
        return enderecoRepository.findAll();
    }

    @PostMapping("/registroEdereco")
    @ApiOperation(value = "Cadastra um novo Endereço")
    public RegistroEntityEndereco cadastroDeUmNovoEndereco(@RequestBody RegistroEntityEndereco endereco){
        return enderecoRepository.save(endereco);
    }
}
