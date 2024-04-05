package br.com.danilo.screenmatch.modelos;
import br.com.danilo.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

//-----------------------------------------------------------------
// getters and setters:

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return (int) pegaMedia() / 2;
    }
}
