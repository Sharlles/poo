import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ControleDePedidos implements InterfaceSistemaDeControle {

	public List<Pedido> pedidos;
	
	public ControleDePedidos(){
		this.pedidos = new ArrayList<Pedido>();
	}
	@Override
	public void adicionaPedido(Pedido p) {
		this.pedidos.add(p);

	}
	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
		int contador = 0;
		for(Pedido p: this.pedidos){
			if(p.getCliente().getNome().equals(nomeCliente));{
				contador++;
			}
		}
			return contador;
	}
	

	@Override
	public List<Pedido> pesquisaPedidosIncluindoProduto(long CodProduto) {
		List<Pedido> pedidosProcurados = new LinkedList<Pedido>();
		for(Pedido p: this.pedidos){
			List<ItemDePedido> itens = p.getItens();
		for(ItemDePedido it: itens){
			if(it.getCodProduto().equals(CodProduto));
			pedidosProcurados.add(p);
			}
		}
	
		return pedidosProcurados;
	}

	@Override
	public void removePedido(long numeroPedido) {
		for(Pedido p: this.pedidos){
			if(p.getNumeroDoPedido() == numeroPedido){
				this.pedidos.remove(p);
			}
		}

	}

}
