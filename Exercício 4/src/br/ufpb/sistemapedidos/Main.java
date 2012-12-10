package br.ufpb.sistemapedidos;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner esc = new Scanner(System.in);
		Pedido p = new Pedido(1);
		double valor = 0;
		boolean c = false;
		do{
			System.out.println("Digite o codigo");
			String cod = esc.nextLine();
			System.out.println("Digite a quantidade");
			String quant = esc.nextLine();
			System.out.println("Digite o valor unitario");
			String valorUnitario = esc.next();
			if(cod.equals("0")){
				c = false;
				quant = "0";
				valorUnitario = "0";
			}
			 ItemDePedido it = new ItemDePedido(cod, Integer.parseInt(quant), Double.parseDouble(valorUnitario));
			 p.adicionaItem(it);
			 valor=p.getValorTotal()+valor;
			 
		}while(c != false);
			System.out.println("O valor Total: R$ "+p.getValorTotal());
	}

}

