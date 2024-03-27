package pag1;

public class Mamifero extends Super {
	//atributo exclusivo 
	private String corPelo;

@Override
public void locomover() {
	System.out.println("andando ");
}
@Override
public void comer() {
	System.out.println("mamando");
}
@Override
public void fazerBarulho() {
	System.out.println("barulho de mamifero");
	
}
//get e set 
public String getCorPelo() {
	return corPelo;
}
public void setCorPelo(String corPelo) {
	this.corPelo = corPelo;
}
	

}

//APOS CRIAR AS CLASSES EXTENDIDA DAS SUPER 
//CRIE UMA CLASSE MAIN PARA TESTAR OS OBJETOS DA CLASS REPTIO E MAMIFER 