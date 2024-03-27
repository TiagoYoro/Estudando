package pag1;

public class Reptio extends Super {
	//atriibuto exclusivo 
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("nadando ");
	}
	@Override
	public void comer() {
		System.out.println("comendo algas ");
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("barulho de reptio ");
		
	}
	// get sett
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
