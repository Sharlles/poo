


import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Esta classe implementa a interface interfaceSistemaDeControle
 */

public class ControleDePedidos implements InterfaceSistemaDeControle {
	private List<Pedido> pedidos;
	
	/**
	 * Este contrudor inicializa a lista do tipo arrayList.
	 */
	
	public ControleDePedidos(){
		this.pedidos = new ArrayList<Pedido>();
	}
	
	/**
	 * Passa um objeto do tipo Pedido que ser· adicionado em um Arraylist.
	 * @param pedido Recebe um objeto do tipo pedido.
	 */
	@Override
	public void adicionaPedido(Pedido p) {
		this.pedidos.add(p);

	}
	
	/**
	 * Pesquisa um produto passando seu codigo
	 * @param codProduto … o código do produto que esta pesquisando.
	 * @return uma lista com os pedidos que contém o produto pesquisado.
	 */

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
	
	/**
	 * Remove um pedido.
	 * @param numeroPedido o numero do pedido que quer remover.
	 */

	@Override
	public void removePedido(long numPedido) {
		for(Pedido p : this.pedidos){
			if(p.getNumPedido() == numPedido){
				pedidos.remove(p);
				}
			}
		}
	
	/**
	 * Calcula a quantidade total de pedidos feitos pelo cliente.
	 * @param nomeCliente O nome do cliente pesquisado.
	 * @return a quantidade de pedidos feitos por esse cliente.
	 */
	public int calcQuantPedidosDoCliente(String nome){
		int contador = 0;
		for(Pedido p : this.pedidos ){ //Pedidos.size() È a quantidade de elementos da lista 
			if(nome.equals(p.getCliente().getNome()));
			contador++;
		}
		return contador;
	}
}
