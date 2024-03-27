package pag1;

public abstract class Super {
	private String nome;
	private  int idade=0;
	private  int membros=0;
	
	//metodos abstratos 
	public abstract void locomover();
	public abstract void comer();
	public abstract void fazerBarulho();
	//gett e sett 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	
//faça duas classes onde tera dois tipos de animais 
	//reptio e mamifero
	//use o EXTENDS  para estender os metodo e atributos desta  classes nas classe reptio e mamifero 
	
	
	

}
