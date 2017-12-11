package Model;

public class Equipamentos {
private boolean ligado;
	
	public void liga() {
		if(this.ligado == false) {
			this.ligado = true;
		}
	}
	public void desliga() {
		if(this.ligado) {
			this.ligado = false;
		}
	}
	public void inverte() {
		if(this.ligado) {
			this.ligado = false;
		}
		else {
			this.ligado = true;
		}
		
	}
	public boolean estaLigado() {
		return this.ligado;
	}
	
	

}