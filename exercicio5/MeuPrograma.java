
public class MeuPrograma {
	public static void main(String args[]){
		Agenda a = new Agenda();
			a.adicionarContato("Sharlles", "333333");
		
	try{
		a.pesquisarContato("Sharlles");
	}
		catch(ContatoInexistenteException e){
			System.err.println(e.getMessage());
		}
	try{
		a.pesquisarContato(" Maria");
	}
	catch(ContatoInexistenteException e){
		System.out.println("Contato não cadastrado: "+ e.getMessage());
		}
	}

}
