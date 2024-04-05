import br.com.danilo.screenmatch.calculos.CalculadoraDeTempo;
import br.com.danilo.screenmatch.modelos.Filme;
import br.com.danilo.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso Picão");
        meuFilme.setAnoDeLancamento(1969);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie breakingBad = new Serie();
        breakingBad.setNome("Breaking Bad");
        breakingBad.setAnoDeLancamento(2012);
        breakingBad.exibeFichaTecnica();
        breakingBad.setTemporadas(2);
        breakingBad.setEpisodiosPorTemporada(12);
        breakingBad.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Breaking Bad: " + breakingBad.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("John Wick");
        outroFilme.setAnoDeLancamento(2020);
        outroFilme.setDuracaoEmMinutos(111);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(breakingBad);
        System.out.println(calculadora.getTempoTotal());





    }
}
