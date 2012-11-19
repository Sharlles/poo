import java.util.LinkedList;
import java.util.List;


public class Agenda implements AgendaIf {
  private List<Contato> contatos;
  
  public Agenda(){
	  this.contatos = new LinkedList<Contato>();
  }
	@Override
	public void adicionarContato(String nome, String tel) {
		this.contatos.add(new Contato(nome, tel));

	}

	@Override
	public Contato pesquisarContato(String nome)throws ContatoInexistenteException {
		for(Contato aux:contatos){
			if(aux.getNome().equals(nome)){
			return aux;
			}
		}
		throw new ContatoInexistenteException("Não existe este contato"+nome);
	
	
	}

	@Override
	public void removerContato(String nome) throws ContatoInexistenteException {
		boolean achou = false;
		for(Contato c: this.contatos){
			if(c.getNome().equals(nome)){
				this.contatos.remove(c);
				achou =true;
				
			}
			if(achou == false){
				throw new ContatoInexistenteException("Contato não existe"+nome);
			}
		}

	}

}
