
public class Exercicio6 {

	public static void main(String[] args) {
		/*
		6) (opcional)ImprimaosprimeirosnúmerosdasériedeFibonacciatépassarde100.
		AsériedeFibonacci éaseguinte:0,1,1,2,3,5,8,13,21,etc...
		Paracalculá-la,oprimeiroelementovale0,osegundovale1,daí pordiante,
		on-ésimoelementovaleo(n-1)-ésimoelementosomadoao(n-2)-ésimoelemento(ex: 8=5 +3)
		 */

				long T = 0;
				long Q = 1;
				long Z = 1;
				for (int i = 1; i <= 100; i++) {
					if (i == 1) {
						System.out.println(T);
					}
					if (i== 2 || i==3) {
						System.out.println(Q);
					}
					else {
						T = Q;
					    Q = Z;
					    Z = T + Q;

						System.out.println(Z);
					}
				}}}