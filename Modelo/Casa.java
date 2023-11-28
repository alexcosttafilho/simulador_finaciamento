package Modelo;

public class Casa extends Financiamento {

    double areaTerreno;
    double areaConstruida;

    public Casa(double preco_Imovel, int prazo_Financiamento, double taxa_Juros_Anual, double areaConstruida, double areaTerreno){
        super(preco_Imovel, prazo_Financiamento, taxa_Juros_Anual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    @Override
    public double pagamento_Mensal(){
        double pmt = (this.getValorImovel()/this.getPrazo())*(1+(this.getTaxa()/12))+80;
        return pmt;
      }
}
