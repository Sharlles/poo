import java.util.ArrayList;
import java.util.List;


public class Pedido {
	private long numeroDoPedido;
	private Cliente cliente;
	private List<ItemDePedido> itens;
	
	public Pedido(long numero){
		this.numeroDoPedido = numero;
		this.cliente = new Cliente();
		this.itens = new ArrayList<ItemDePedido>(); // Para alocar espaço na memória  
	}
	public long getNumeroDoPedido(){
		return numeroDoPedido;
	}
	public void setNumeroDoPedido(long numero){
		this.numeroDoPedido = numero;
	}
	public Cliente getCliente(){
		return cliente;
	}
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	public List<ItemDePedido> getItens(){
		return itens;
	}
	public void adicionaItem(ItemDePedido item){
		itens.add(item);
		}
	public String toString(){
		return ("Nome do cliente: "+getCliente().getNome()) + ("\nNº do pedido: "+getNumeroDoPedido()+"\n") +(this.itens.toString());
		}
	}

