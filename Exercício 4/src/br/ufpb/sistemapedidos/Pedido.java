package br.ufpb.sistemapedidos;

import java.util.List;

public class Pedido {
	private long numPedido;
	private Cliente cliente;
	private List<ItemDePedido> itens;

	public Pedido(long numeroDoPedido) {
		this.numPedido = numeroDoPedido;
	}

	public List<ItemDePedido> getItens() {
		return itens;
	}

	public void adicionaItem(ItemDePedido item) {
		itens.add(item);
	}

	public long getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(long numeroDoPedido) {
		this.numPedido = numeroDoPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		double retorno = 0;
		for (ItemDePedido aux : itens) {
			retorno += aux.getSubTotal();
		}
		return retorno;

	}
}
