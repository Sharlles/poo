
public class MeuPrograma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Maria");
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente("Jose");
		System.out.println(c1.getNome());
		System.out.println(c2.getNome());
		System.out.println(c3.getNome());
		ItemDePedido p = new ItemDePedido("123",3, 3.0);
		System.out.println(p.getQuantidade());
		System.out.println(p.getValorUnitario());
		ControleDePedidos cpd = new ControleDePedidos();
		Pedido p1 = new Pedido(4);
		p1.setCliente(c1);
		System.out.println(p1);
		Pedido p2 = new Pedido(12);
		p2.setCliente(c1);
		cpd.adicionaPedido(p1);
		cpd.adicionaPedido(p2);
		System.out.println(cpd.calculaQuantidadeDePedidosDoCliente("Maria"));
	
	}
	

}
