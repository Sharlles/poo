
public class Contato {
 private String nome;
 private String telefone;
 
 public Contato(String nome,String tel){
	 this.nome = nome;
	 this.telefone = tel;

 }
 public String getNome(){
	 return nome;
	
 }
 public void setNome(String n){
	 this.nome = n;
 }
 public String getTelefone(){
	 return telefone;
 }
 public void setTelefone(String tel){
	 this.telefone = tel;
 }
}
