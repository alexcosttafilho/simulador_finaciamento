package Interface;
import java.util.Scanner;

public class InterfaceUsuario {
    Scanner scanner = new Scanner(System.in);

    public double insereValorImovel(){
        double valorImovel = 0;
        do {
            System.out.print("Digite o valor do imóvel: ");
            double insertValor = scanner.nextDouble();
            if (insertValor > 0){ 
                valorImovel = insertValor;
                break;
            } else{
                System.out.println("Erro: O valor do imóvel deve ser maior que zero \nTente novamente... \n");
            }
        } while (true);
        
        System.out.println("_________________________________");
        return valorImovel;
    }

    public double insereTaxaDeJurosAnual(){
        double taxaDeJurosAnual = 0;
        do {
            System.out.print("Digite a taxa de juros anual: ");
            double insertTaxa = (scanner.nextDouble())/100;
            if(insertTaxa>0){
                taxaDeJurosAnual = insertTaxa;
                break;
            } else{
                System.out.println("Erro: A axa de juros deve ser maior que zero \nTente novamente...\n");
            }
        } while (true);
        
        System.out.println("_________________________________");    
        return taxaDeJurosAnual;
    }

    public int inserePrazoFinanciamento(){
        int prazoFinanciamento = 0;
        do {
            System.out.print("Digite o prazo do financiamento: ");
            int insertPrazo = scanner.nextInt();
            if (insertPrazo>0){
                prazoFinanciamento = insertPrazo;
                break;
            } else {
                System.out.println("Erro: O prazo deve ser maior que zero \nTente novamente...\n");
            }
        } while (true);
        
        System.out.println("_________________________________");
        return prazoFinanciamento;
    }
}
