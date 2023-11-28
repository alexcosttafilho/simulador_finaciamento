package Interface;
import java.util.Scanner;

public class InterfaceUsuario {
    Scanner scanner = new Scanner(System.in);

    public double insereValorImovel(){
        double valorImovel = 0;
        do {
            try {
                System.out.print("(1) Digite o valor do imóvel: ");
                double insertValor = scanner.nextDouble();
                valorImovel = insertValor;
                break;
            } catch (NumberFormatException e){
                System.err.println("Somente números");
            }
        } while (true);
        
        return valorImovel;
    }

    public int inserePrazoFinanciamento(){
        int prazoFinanciamento = 0;
        do {
            try {
                System.out.print("(2) Digite o prazo do financiamento: ");
                int insertPrazo = scanner.nextInt();
                prazoFinanciamento = insertPrazo;
                break;

            } catch (NumberFormatException e){
                System.err.println("Somente Números");
            }
        } while (true);
        
        return prazoFinanciamento;
    }

    public double insereTaxaDeJurosAnual(){
        double taxaDeJurosAnual = 0;
        do {
            try {
                System.out.print("(3) Digite a taxa de juros anual: ");
                double insertTaxa = (scanner.nextDouble())/100;
                taxaDeJurosAnual = insertTaxa;
                break;
            } catch (NumberFormatException e){
                System.err.println("Somente números");
            }
        } while (true);

        return taxaDeJurosAnual;
    }

    public int insereTipo(){
        int tipo = 0;
        do {
            try {
                System.out.println("(4) Qual o tipo do imóvel a ser financiado:");
                System.out.println("   (1) Apartamento");
                System.out.println("   (2) Casa");
                System.out.println("   (3) Terreno");
                System.out.print("Opção: ");
                int insertTipo = scanner.nextInt();
                tipo = insertTipo;
                break;

            } catch (NumberFormatException e){
                System.err.println("Somente Números");
            }
        } while (true);
        
        return tipo;
    }    

    public double insereAreaTerreno(){
        double areaTerreno = 0;
        do {
            try {
                System.out.print("(5) Qual a área total do terreno: ");
                double insertArea = scanner.nextDouble();
                areaTerreno = insertArea;
                break;

            } catch (NumberFormatException e){
                System.err.println("Somente Números");
            }
        } while (true);
        
        return areaTerreno;        
    }

    public double insereAreaConstruida(){
        double areaConstruida = 0;
        do {
            try {
                System.out.print("(6) Qual a área total da construção: ");
                double insertArea = scanner.nextDouble();
                areaConstruida = insertArea;
                break;

            } catch (NumberFormatException e){
                System.err.println("Somente Números");
            }
        } while (true);
        
        return areaConstruida;
    }

    public int insereAndar(){
        int andar = 0;
        do {
            try {
                System.out.print("(5) Qual o andar do apartamento: ");
                int insertAndar = scanner.nextInt();
                andar = insertAndar;
                break;

            } catch (NumberFormatException e){
                System.err.println("Somente Números");
            }
        } while (true);
        
        return andar;        
    }

    public int insereVagas(){
        int vagas = 0;
        do {
            try {
                System.out.print("(6) Quantas vagas de garagem o apartamento possui: ");
                int insertVagas = scanner.nextInt();
                vagas = insertVagas;
                break;

            } catch (NumberFormatException e){
                System.err.println("Somente Números");
            }
        } while (true);
        
        return vagas;        
    }

    public String insereZona(){
        String zona = "";
        do {
            try {
                System.out.print("(5) Digite a zona do imóvel: ");
                String insertZona = scanner.nextLine();
                zona = insertZona;
                break;

            } catch (NumberFormatException e){
                System.err.println("Somente Números");
            }
        } while (true);
        
        return zona;
    }
}
