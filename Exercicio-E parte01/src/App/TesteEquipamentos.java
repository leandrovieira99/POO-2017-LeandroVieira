package App;
import Model.Equipamentos;

public class TesteEquipamentos {
	public static void main(String[] args) {
		Equipamentos a = new Equipamentos();
		Equipamentos b = new Equipamentos();
		a.liga();
		b.desliga();
		a.inverte();
		b.inverte();
		if(a.estaLigado()) {
			System.out.println("esta ligado1");
		}
		if(b.estaLigado()) {
			System.out.println("esta ligado2");
		}
		

	}

}