package Main;
import java.io.FileWriter;
import java.util.*;

import Modelo.Apto;
import Modelo.Casa;
import Modelo.Financiamento;
import Modelo.Terreno;
import Interface.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {

        var financiamentos = new ArrayList<Financiamento>();

        financiamentos.add(new Casa(500000, 180, 16, 42, 60));
        financiamentos.add(new Casa(750000, 120, 22, 75, 87));
        financiamentos.add(new Apto(150000, 60, 14, 11, 0));
        financiamentos.add(new Apto(800000, 240, 32, 9, 2));
        financiamentos.add(new Terreno(60000, 36, 22, "Residencial"));

        System.out.println("Bem-vindo(a) ao Simulador de Financiamentos");
        System.out.println("___________________________");

        InterfaceUsuario tela = new InterfaceUsuario();

        double imovel_preco = tela.insereValorImovel();
        int finan_prazo = tela.inserePrazoFinanciamento();
        double finan_taxa = tela.insereTaxaDeJurosAnual();
        int tipo_imovel = tela.insereTipo();

        if (tipo_imovel == 1){
        int numeroVagas = tela.insereAndar();
        int numeroAndar = tela.insereVagas();
        financiamentos.add(new Apto(imovel_preco, finan_prazo, finan_taxa, numeroAndar, numeroVagas));
        
        } else if (tipo_imovel == 2){
        double construcao = tela.insereAreaTerreno();
        double terreno = tela.insereAreaConstruida();
        financiamentos.add(new Casa(imovel_preco, finan_prazo, finan_taxa, construcao, terreno));
        
        } else if (tipo_imovel == 3){
        String zonaImovel = tela.insereZona();
        financiamentos.add(new Terreno(imovel_preco, finan_prazo, finan_taxa, zonaImovel));
        
        } else {
        
        }

        System.out.println("Essas são as informações dos seus financiamentos: \n");

        double somaValoresImovel = 0;
        double somaValoresFinanciamentos = 0;

        for (Financiamento g : financiamentos){
            System.out.print("Parcela: R$" + g.pagamento_Mensal());
            System.out.println(", valor  do financiamento: R$" + g.pagamento_Total());
            System.out.println("----------");

            somaValoresImovel = somaValoresImovel + g.getValorImovel();
            somaValoresFinanciamentos =+ somaValoresFinanciamentos + g.pagamento_Total();
        }

        System.out.print("Total de todos os imóveis: " + somaValoresImovel);
        System.out.println(", Total de todos os financiamentos: " + somaValoresFinanciamentos);

            

            
    }

}
