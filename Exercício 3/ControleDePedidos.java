package Exercicio1;


import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

public class ControleDePedidos implements InterfaceSistemaDeControle {
	private List<Pedido> pedidos;
	
	public ControleDePedidos(){
		this.pedidos = new ArrayList<Pedido>();
	}
	@Override
	public void adicionaPedido(Pedido p) {
		this.pedidos.add(p);

	}

	@Override
	public List<Pedido> pesquisaPedidosIncluindoProduto(String codProduto) {
		List<Pedido> pesquisa = new ArrayList<Pedido>();
		for(Pedido p : pedidos){
		for(ItemDePedido item: p.getItens()){
			if(item.getCodProduto().equals(codProduto)){
				pesquisa.add(p);
				}
			}
		}
		return pesquisa;
		
	}

	@Override
	public void removePedido(long numPedido) {
		for(Pedido p : this.pedidos){
			if(p.getNumPedido() == numPedido){
				pedidos.remove(p);
				}
			}
		}
	public int calcQuantPedidosDoCliente(String nome){
		int contador = 0;
		for(Pedido p : this.pedidos ){ //Pedidos.size() é a quantidade de elementos da lista 
			if(nome.equals(p.getCliente().getNome()));
			contador++;
		}
		return contador;
	}
}
