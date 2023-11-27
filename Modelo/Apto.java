package Modelo;
import java.lang.Math;

public class Apto extends Financiamento {
    
    public Apto(double preco_Imovel, int prazo_Financiamento, double taxa_Juros_Anual){
        super(preco_Imovel, prazo_Financiamento, taxa_Juros_Anual);
    }

    public double pagamento_Mensal(){
        double pmt = (this.getValorImovel() * (this.getTaxa()/12) * Math.pow(1+(this.getTaxa()/12), this.getPrazo()))/(Math.pow(1+(this.getTaxa()/12), this.getPrazo())-1);
        return pmt;
      }
}
