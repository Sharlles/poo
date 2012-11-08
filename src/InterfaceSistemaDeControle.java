import java.util.List;


public interface InterfaceSistemaDeControle {
	public void adicionaPedido(Pedido p);
	public List<Pedido> pesquisaPedidosIncluindoProduto(long CodProduto);
	public void removePedido(long numeroPedido);
}
