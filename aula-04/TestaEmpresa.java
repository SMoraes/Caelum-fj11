public class TestaEmpresa {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		empresa.setEmpregado(new Funcionario[3]);
		Data data = new Data();

		Funcionario f1 = new Funcionario();
		f1.setNome("Jorge Alberto");
		f1.setDepartamento("Cabeleleiro");
		f1.setSalario(3000);
		f1.setdataEntrada = data;
		f1.setdataEntrada.dia = 02;
		f1.setdataEntrada.mes = 07;
		f1.setdataEntrada.ano = 2018;
		f1.setRg("89.568.963-84");
		empresa.adiciona(f1);
		empresa.contem(f1);

		Funcionario f2 = new Funcionario();
		f2.setNome("Sergio Adriano");
		f2.setDepartamento("Desenvolvedor");
		f2.setSalario(6000);
		f2.setdataEntrada = data;
		f2.setdataEntrada.dia = 04;
		f2.setdataEntrada.mes = 9;
		f2.setdataEntrada.ano = 2011;
		f2.setRg("89.568.963-84");
		empresa.adiciona(f2);
		empresa.contem(f2);

		Funcionario f3 = new Funcionario();

		f3.setNome("Beatriz Ramos");
		f3.setDepartamento("Suporte e manutenção");
		f3.setSalario(200);
		f3.setdataEntrada = data;
		f3.setdataEntrada.dia = 10;
		f3.setdataEntrada.mes = 2;
		f3.setdataEntrada.ano = 2015;
		f3.setRg("56-542-569-84");
		empresa.adiciona(f3);
		empresa.contem(f3);

		Funcionario f4 = new Funcionario();

		f4.setNome("Alessandro Moraes");
		f4.setDepartamento("Tecnino Empilhadeira");
		f4.setSalario(8000);
		f4.setdataEntrada = data;
		f4.setdataEntrada.dia = 30;
		f4.setdataEntrada.mes = 2;
		f4.setdataEntrada.ano = 2009;
		f4.setRg("56-542-569-84");
		empresa.adiciona(f4);
		empresa.contem(f4);

		empresa.mostraEmpregados(); // usar metodo no final de uma instancia

	}

}
