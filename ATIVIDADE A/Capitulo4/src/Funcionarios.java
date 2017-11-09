/*
 * 1) Modeleumfuncionário. Eledeveteronomedofuncionário,odepartamentoondetrabalha,seusalário (double),
 * adatadeentradanobanco(String)eseuRG(String). 
 * 
 * Você deve criar alguns métodos de acordo com sua necessidade. 
 * 
 * Além deles, crie um método recebeAumento que aumenta o salario do funcionário de acordo com o parâmetro passado
 * como argumento. 
 * 
 * Crietambémummétodo calculaGanhoAnual,quenãorecebeparâmetroalgum,devolvendo ovalordosaláriomultiplicadopor12..
 * Aideiaaquiéapenasmodelar,istoé,sóidentifiquequeinformaçõessãoimportanteseoqueumfuncionáriofaz.DesenhenopapeltudooqueumFuncionario
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


