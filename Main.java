import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Locomotiva locomotiva = new Locomotiva("456", 5000, 10.0);
        Vagao vagao = new Vagao("123", "Carga", 10000, 5.0, 2.0);

        EstacaoFerroviaria estacao1 = new EstacaoFerroviaria("EST1", "Estação Principal");
        EstacaoFerroviaria estacao2 = new EstacaoFerroviaria("EST2", "Estação Nordeste");

        ArrayList<RecursoFerroviario> recursosTrem1 = new ArrayList<>();
        recursosTrem1.add(new RecursoFerroviario(locomotiva));
        recursosTrem1.add(new RecursoFerroviario(vagao));

        ArrayList<RecursoFerroviario> recursosTrem2 = new ArrayList<>();
        recursosTrem2.add(new RecursoFerroviario(locomotiva));

        Trem trem1 = new Trem("NAG1010", recursosTrem1, estacao1, estacao2, new Date());
        Trem trem2 = new Trem("NAG1011", recursosTrem2, estacao2, estacao2, new Date());

        estacao1.adicionarTrem(trem1);
        estacao2.adicionarTrem(trem2);

      
        ArrayList<RecursoFerroviario> recursosLinha1 = new ArrayList<>(recursosTrem1);
        recursosLinha1.add(new RecursoFerroviario(trem1));
        ArrayList<RecursoFerroviario> recursosLinha2 = new ArrayList<>(recursosTrem2);
        recursosLinha2.add(new RecursoFerroviario(trem2));
      
        LinhaFerroviaria linha1 = new LinhaFerroviaria(1, 10000, "Linha 1", estacao1, recursosLinha1);
        LinhaFerroviaria linha2 = new LinhaFerroviaria(2, 8000, "Linha 2", estacao1, recursosLinha2);
        LinhaFerroviaria linha3 = new LinhaFerroviaria(3, 12000, "Linha 3", estacao2, new ArrayList<>());

        estacao1.adicionarLinha(linha1);
        estacao1.adicionarLinha(linha2);
        estacao2.adicionarLinha(linha3);
      

        System.out.println("Estação Ferroviária 1:");
        System.out.println(estacao1.toString());

        System.out.println("\nEstação Ferroviária 2:");
        System.out.println(estacao2.toString());

        System.out.println("\nLocomotiva:");
        System.out.println(locomotiva.toString());

        System.out.println("\nVagão:");
        System.out.println(vagao.toString());

        System.out.println("\nLinha Ferroviária 1:");
        System.out.println(linha1.toString());

        System.out.println("\nLinha Ferroviária 2:");
        System.out.println(linha2.toString());

        System.out.println("\nLinha Ferroviária 3:");
        System.out.println(linha3.toString());

        System.out.println("\nTrem 1:");
        System.out.println(trem1.toString());

        System.out.println("\nTrem 2:");
        System.out.println(trem2.toString());
    }
}
