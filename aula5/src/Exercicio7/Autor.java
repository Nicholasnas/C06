package aula5.Exercicio7;

import java.util.Scanner;

public class Autor {
    String nome;
    String nacionalidade;
    Livro livro;

    Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    Livro escreverLivro(String titulo){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o nome da biblioteca: ");
        String nome_biblioteca = entrada.nextLine();
        System.out.println("Entre com o endereço da biblioteca: ");
        String endereco_biblioteca = entrada.nextLine();

        Livro livro = new Livro(titulo, this.nome, nome_biblioteca , endereco_biblioteca);
        System.out.println("Entre com o texto do livro " +titulo+ ": ");
        String textoLivro = entrada.nextLine();

        entrada.close();
        return livro;
    
    }

    String obterBiografia(){
        return "O autor " +nome+ " natural de " +nacionalidade+ " escreveu o livro " +livro;

    }
    
}
