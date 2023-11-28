package Modelo;

public class Terreno extends Financiamento {

    String tipoZona;
    
    public Terreno(double preco_Imovel, int prazo_Financiamento, double taxa_Juros_Anual, String tipoZona){
        super(preco_Imovel, prazo_Financiamento, taxa_Juros_Anual);
        this.tipoZona = tipoZona;
    }

    @Override
    public double pagamento_Mensal(){
        double pmt = (this.getValorImovel()/this.getPrazo())*(1+(this.getTaxa()/12))*1.02;
        return pmt;
      }        
}
