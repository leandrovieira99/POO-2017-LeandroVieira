/*7) (opcional)Escrevaumprogramaque,dadaumavariávelxcomalgumvalorinteiro,
 temosumnovoxde acordocomaseguinteregra: • sexépar,x = x / 2 • sexéimpar,x = 3 * x + 1 •
  imprimex • Oprogramadevepararquandoxtiverovalorfinalde1.Porexemplo,parax = 13,asaídaserá: 
  40->20->10->5->16->8->4->2->1
 */
import java.util.Scanner;
public class Exercicio7 {
		public static void main(String args[]) {
			int v;
			System.out.printf("Digite um numero:");
			Scanner numero = new Scanner(System.in);
			v = numero.nextInt();
			
			while (v != 1) {
				if(v % 2 == 0 && v != 2) {
					v = v /2;
					System.out.printf("%d->",v);
				}
				else {
					if (v%2 !=0) {
						v = v * 3 +1;
						System.out.printf("%d->",v);
					}
					else {
						v = v /2;
						System.out.printf("%d",v);
					}

				}
			}

		}

	}