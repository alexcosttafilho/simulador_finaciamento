package Modelo;
import java.lang.Math;

public class Apto extends Financiamento {

    int qtdVagas;
    int andar;
    
    public Apto(double preco_Imovel, int prazo_Financiamento, double taxa_Juros_Anual, int andar, int qtdVagas){
        super(preco_Imovel, prazo_Financiamento, taxa_Juros_Anual);
        this.qtdVagas = qtdVagas;
        this.andar = andar;
    }
    
    @Override
    public double pagamento_Mensal(){
        double pmt = (this.getValorImovel() * (this.getTaxa()/12) * Math.pow(1+(this.getTaxa()/12), this.getPrazo()))/(Math.pow(1+(this.getTaxa()/12), this.getPrazo())-1);
        return pmt;
      }
}
