package aula5.Exercicio7;

public class Livro {
    String titulo;
    String autor;
    Pessoa pessoa;
    Biblioteca biblioteca;

    Livro(String titulo, String autor, String nameBiblioteca, String enderecoBiblioteca)
    {
        this.titulo = titulo;
        this.autor = autor;
        biblioteca = new Biblioteca(nameBiblioteca, enderecoBiblioteca);
    }

    public String detalhes(){
        sout 

    }
    public void emprestar(){

    }
    public void devolver(){

    }
    
}
