
public class Exercicio6 {

	public static void main(String[] args) {
		/*
		6) (opcional)Imprimaosprimeirosn�merosdas�riedeFibonacciat�passarde100.
		As�riedeFibonacci �aseguinte:0,1,1,2,3,5,8,13,21,etc...
		Paracalcul�-la,oprimeiroelementovale0,osegundovale1,da� pordiante,
		on-�simoelementovaleo(n-1)-�simoelementosomadoao(n-2)-�simoelemento(ex: 8=5 +3)
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