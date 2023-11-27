package Modelo;
public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double preco_Imovel, int prazo_Financiamento, double taxa_Juros_Anual){
        this.valorImovel = preco_Imovel;
        this.prazoFinanciamento = prazo_Financiamento;
        this.taxaJurosAnual = taxa_Juros_Anual;
    }

    public double pagamento_Mensal(){
      double pmt = (this.valorImovel/this.prazoFinanciamento)*(1+(this.taxaJurosAnual/12));
      return pmt;
    }

    public double pagamento_Total(){
        double mensal = pagamento_Mensal();
        double ssd = mensal * this.prazoFinanciamento;
        return ssd;
    }

    public double getValorImovel(){
        return this.valorImovel;
    }

    public int getPrazo(){
        return this.prazoFinanciamento;
    }

    public double getTaxa(){
        return this.taxaJurosAnual;
    }

    public void imprimeDados(){
        System.out.println("Aqui estão algumas informações sobre o seus financiamento:");
        System.out.println("Valor do Imóvel: " + this.valorImovel);
        System.out.println("Soma das parcelas do financiamento: " + this.pagamento_Total());
    }
}
