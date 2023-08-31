package domain;

public class Pedra implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        // TODO Auto-generated method stub
        switch(tipo){
            case PAPEL:
                System.out.println("Perdeu! Papel embrulha Pedra");
                break;
            case SPOCK:
                System.out.println("Perdeu! Spock vaporiza pedra");
                break;
            case TESOURA:
                System.out.println("Ganhou! Pedra quebra tesoura");
                break;
            case LAGARTO:
                System.out.println("Ganhou! Pedra esmaga lagarto");
                break;
            
            default:
                System.out.println("Empatou! Papel empata com Papel.");
        }
    }
    
}
