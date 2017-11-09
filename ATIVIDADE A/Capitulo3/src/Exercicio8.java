/*8) (opcional)Imprimaaseguintetabela,usandoforsencadeados:
1 2 4 3 6 9 4 8 12 16 n n*2 n*3 .... n*n
*/

public class Exercicio8 {

	public static void main(String[] args) {
		System.out.println(1);

		for (int i = 2; i <= 4; i+=2) {
			System.out.print(i + " ");
		}
		System.out.print("\n");

		for (int i = 3; i <= 9; i+=3) {
			System.out.print(i + " ");
			}
		System.out.print("\n");

		for (int i = 4; i <= 16; i+=4) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		}

}