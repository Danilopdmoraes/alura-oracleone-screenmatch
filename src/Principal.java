import br.com.danilo.screenmatch.calculos.CalculadoraDeTempo;
import br.com.danilo.screenmatch.calculos.FiltroRecomendacao;
import br.com.danilo.screenmatch.modelos.Episodio;
import br.com.danilo.screenmatch.modelos.Filme;
import br.com.danilo.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);


        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("--------------------------");
        meuFilme.exibeFichaTecnica();

        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());
        System.out.println("--------------------------");

        Serie breakingBad = new Serie();
        breakingBad.setNome("Breaking Bad");
        breakingBad.setAnoDeLancamento(2012);

        breakingBad.exibeFichaTecnica();

        breakingBad.setTemporadas(5);
        breakingBad.setEpisodiosPorTemporada(12);
        breakingBad.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratonar Breaking Bad: " + breakingBad.getDuracaoEmMinutos());
        System.out.println("--------------------------");


        Filme outroFilme = new Filme();
        outroFilme.setNome("John Wick");
        outroFilme.setAnoDeLancamento(2020);
        outroFilme.setDuracaoEmMinutos(111);

        System.out.println("--------------------------");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(breakingBad);
        System.out.println("--------------------------");
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.fitra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(breakingBad);
        episodio.setTotalVisualizacoes(300);
        filtro.fitra(episodio);

    }
}
