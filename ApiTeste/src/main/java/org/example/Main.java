package org.example;

import org.example.Dto.EnderecoDto;
import org.example.Servico.ApiServico;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ApiServico apiServico = new ApiServico();
        String cep;
        System.out.println("Informe seu CEP: ");
        cep = System.console().readLine();
        try {
            EnderecoDto enderecoDto = apiServico.getEndereco(cep);
            System.out.println(enderecoDto.getLocalidade());
            System.out.println(enderecoDto.getLogradouro());
            System.out.println(enderecoDto.getBairro());
            System.out.println(enderecoDto.getUf());
        } catch (IOException | InterruptedException e){
            throw new RuntimeException();
        }

    }
}