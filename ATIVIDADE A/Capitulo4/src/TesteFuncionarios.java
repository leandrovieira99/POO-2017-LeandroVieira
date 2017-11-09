
public class TesteFuncionarios {

	public static void main(String[] args) {
		/*
		2) TransformeomodeloacimaemumaclasseJava.Teste-a,usandoumaoutraclassequetenhaomain.Você devecriaraclassedofuncionáriocomonome
		 Funcionario,maspodenomearcomoquiseraclassede testes,contudo,eladevepossuirométodomain. 
		 */
 
			Funcionarios f1 = new Funcionarios();
			Funcionarios f2 = new Funcionarios();
			DataDeEntradaBanco data = new DataDeEntradaBanco();
			
			f1.data = data;
			f1.data.dia = 20;
			f1.data.mes = 01;
			f1.data.ano = 1980;
			
			f1.nomeFuncionario("Joao");
			f1.salario(2000);
			f1.departamento("Almoxarifado");
			f1.RG("2.264");
			f1.aumentosalario(1000);
			
						
			f1.mostra();
			
			f2.data = data;
			f2.data.dia = 20;
			f2.data.mes = 01;
			f2.data.ano = 1980;
			
			f2.nomeFuncionario("Antonio");
			f2.salario(1500);
			f2.departamento("Financeiro");
			f2.RG("1.138");
			f2.aumentosalario(1500);
			
			f2.mostra();
		}}


