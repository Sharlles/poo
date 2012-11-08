
public class ItemDePedido {
	private int quantidade;
	private String codProduto;
	private double valorUnitario;
	
	public ItemDePedido(String cod,int quant,double valor){
		this.quantidade = quant;
		this.codProduto = cod;
		this.valorUnitario = valor;
	}

	public int getQuantidade(){
		return quantidade;
	}
	public void setQuantidade(int quant){
		this.quantidade = quant;
	}
	public String getCodProduto(){
		return codProduto;
	}
	public void setCodProduto(String cod){
		this.codProduto = cod;
	}
	public double getValorUnitario(){
		return valorUnitario;
	}
	public void setValorUnitario(double valor){
		this.valorUnitario = valor;
	}
}
