package Main;
import Modelo.Apto;
//import Modelo.Casa;
import Modelo.Financiamento;
//import java.util.ArrayList;
//import Modelo.Terreno;

public class Main {
    public static void main(String[] args) {
        Financiamento novoFin = new Apto(500000, 120, 0.1);

        double valorPmt = novoFin.pagamento_Mensal();

        System.out.println(valorPmt);
    }
}
