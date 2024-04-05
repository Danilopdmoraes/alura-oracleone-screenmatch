package br.com.danilo.screenmatch.calculos;
import br.com.danilo.screenmatch.modelos.Filme;
import br.com.danilo.screenmatch.modelos.Serie;
import br.com.danilo.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
