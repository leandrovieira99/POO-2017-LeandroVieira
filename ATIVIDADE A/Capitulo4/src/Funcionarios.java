/*
 * 1) Modeleumfuncion�rio. Eledeveteronomedofuncion�rio,odepartamentoondetrabalha,seusal�rio (double),
 * adatadeentradanobanco(String)eseuRG(String). 
 * 
 * Voc� deve criar alguns m�todos de acordo com sua necessidade. 
 * 
 * Al�m deles, crie um m�todo recebeAumento que aumenta o salario do funcion�rio de acordo com o par�metro passado
 * como argumento. 
 * 
 * Crietamb�mumm�todo calculaGanhoAnual,quen�orecebepar�metroalgum,devolvendo ovalordosal�riomultiplicadopor12..
 * Aideiaaqui�apenasmodelar,isto�,s�identifiquequeinforma��ess�oimportanteseoqueumfuncion�riofaz.DesenhenopapeltudooqueumFuncionario
 * temetudoqueelefaz. 
 */
public class Funcionarios {

	 
		String nomeFuncionario;
		String departamento;
		double salario;
		DataDeEntradaBanco DataEntrada;
		String RG;
		
		
		void aumentosalario(double aumento) {
			this.salario += aumento;
		}
		
		double ganhoAnual(){
		 return (this.salario * 12);
		}
		
		public void mostra() {
			System.out.println("Nome: "+ this.nomeFuncionario);
			System.out.println("Departamento: "+ this.departamento);
			System.out.println("Salario: "+ this.salario);
			System.out.println("RG: "+ this.RG);
			System.out.println("Data de Entrada: "+ this.DataEntrada);
			System.out.println("Ganho Anual: "+ this.ganhoAnual());
		

	}}


