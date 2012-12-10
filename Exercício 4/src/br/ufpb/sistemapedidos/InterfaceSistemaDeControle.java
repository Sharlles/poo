package br.ufpb.sistemapedidos;

import java.util.List;

/**
 *  Interface que representa os servicos de um sistema de
 * controle de pedidos.Fazendo com que a classe ControleDePedidos implemente seus metodos
 */

public interface InterfaceSistemaDeControle {
	
	/**
	 * Adiciona um pedido no sistema
	 * @param p Pedido a ser adicionado.
	 */
	public void adicionaPedido(Pedido p);

	/**
	 * Pesquisa um produto passando seu codigo
	 * @param codProduto … o código do produto que esta pesquisando.
	 * @return uma lista com os pedidos que contém o produto pesquisado.
	 */
	public List<Pedido> pesquisaPedidosIncluindoProduto(String codProduto);
	/**
	 * Remove um pedido.
	 * @param numeroPedido o numero do pedido que quer remover.
	 */
	public void removePedido(long numPedido);
}
