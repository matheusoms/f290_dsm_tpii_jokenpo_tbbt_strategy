import java.util.Random;
import java.util.Scanner;

import domain.Algoritmo;

import domain.Jokenpo;
import domain.Papel;
import domain.Tesoura;
import domain.Pedra;
import domain.Lagarto;
import domain.Spock;
import domain.TipoAlgoritmo;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Selecione o tipo");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");
        System.out.println("3 - Pedra");
        System.out.println("4 - Lagarto");
        System.out.println("5 - Spock");
        System.out.println();

       //TODO: Criar uma função para converter 'int' em algoritmo;
       
        int escolha = s.nextInt();
        Algoritmo algoritmo = getAlgoritmo(escolha);
       //TODO: Gerar jogada randomica e converter em Enum;
        
        Integer random = new Random().nextInt(5) + 1;
        TipoAlgoritmo computador = TipoAlgoritmo.getTipoAlgoritmo(random);
        
        Jokenpo jokenpo = new Jokenpo();
        jokenpo.setAlgoritmo(algoritmo);
        jokenpo.jogar(computador);

        s.close();

    }
    static Algoritmo getAlgoritmo(Integer id){
        TipoAlgoritmo tipo = TipoAlgoritmo.getTipoAlgoritmo(id);
        switch(tipo){
            case PAPEL:
                return new Papel();
            case TESOURA:
                return new Tesoura();
            case PEDRA:
                return new Pedra();
            case LAGARTO:
                return new Lagarto();
            case SPOCK:
                return new Spock();
            default:
                throw new RuntimeException("Tipo inválido");
        }
    }
}
