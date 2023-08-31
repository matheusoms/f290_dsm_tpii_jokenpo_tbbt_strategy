package domain;

public class Spock implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        // TODO Auto-generated method stub
        switch(tipo){
            case PEDRA:
                System.out.println("Ganhou! Spock vaporiza pedra");
                break;
            case PAPEL:
                System.out.println("Perdeu! Papel refuta Spock");
                break;
            case TESOURA:
                System.out.println("Perdeu! Spock esmaga tesoura");
                break;
            case LAGARTO:
                System.out.println("Ganhou! Lagarto envenena Spock");
                break;
            
            default:
                System.out.println("Empatou! Spock empata com Spock.");
        }
    }
    
}
