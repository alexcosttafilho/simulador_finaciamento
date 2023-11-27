package Modelo;

public class Casa extends Financiamento {

    public Casa(double preco_Imovel, int prazo_Financiamento, double taxa_Juros_Anual){
        super(preco_Imovel, prazo_Financiamento, taxa_Juros_Anual);
    }

    public double pagamento_Mensal(){
        double pmt = (this.getValorImovel()/this.getPrazo())*(1+(this.getTaxa()/12))+80;
        return pmt;
      }
}
