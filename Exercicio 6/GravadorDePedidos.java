

import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GravadorDePedidos {
	public List<Pedido> lePedidos() throws IOException { //Método que ler um arquivo.
		List<Pedido> pedidos = new ArrayList<Pedido>();
	ObjectInputStream camaradaQueLer = null;
		try{
			 camaradaQueLer = new ObjectInputStream(new FileInputStream("arquivos.txt"));
			 return (List<Pedido>) camaradaQueLer.readObject();	
		}catch(FileNotFoundException e){
			throw new IOException ("O Arquivo não encontrado!", e);			
		}catch(IOException e){
			throw e;
		}catch(ClassNotFoundException e){
			throw new IOException("A classe não foi encontrada!");
		}finally{
			if(camaradaQueLer != null){
				camaradaQueLer.close();
			}
		}		
	}

public void GravadorPedidos(List<Pedido> Pedidos) throws IOException { //Método que grava um arquivo. 
		ObjectOutputStream camaradaQueGrava = null;
		try{
			camaradaQueGrava = new ObjectOutputStream(new FileOutputStream("pedidos.txt"));
			camaradaQueGrava.writeObject(Pedidos);
		}catch(FileNotFoundException e){
			throw new IOException ("O Arquivo não encontrado!", e);			
		}catch(IOException e){
			throw e;
		}finally{
				if(camaradaQueGrava != null){
				camaradaQueGrava.close();
			}
		}
	}
}