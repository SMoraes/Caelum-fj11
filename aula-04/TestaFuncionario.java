public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Sergio Adriano");
		Data data = new Data();

//		f1.setNome("Sergio Adriano");
		f1.setDepartamento("Desenvolvimento");
		f1.setSalario(100);
		f1.setdataEntrada = data;
		f1.setdataEntrada.dia = 02;
		f1.setdataEntrada.mes = 07;
		f1.setdataEntrada.ano = 2018;
		f1.setRg("91-691-771-4");
		f1.recebeAumento(50);
		f1.mostra();

		Funcionario f2 = new Funcionario("Beatriz Ramos");

//		f2.setNome("Beatriz Ramos");
		f2.setDepartamento("Suporte e manutenção");
		f2.setSalario(200);
		f2.setdataEntrada = data;
		f2.setdataEntrada.dia = 10;
		f2.setdataEntrada.mes = 2;
		f2.setdataEntrada.ano = 2015;
		f2.setRg("56-542-569-84");
		f2.recebeAumento(100);
		f2.mostra();

		if (f2 == f1) {
			System.out.println(" são iguais");
		} else {
			System.out.println("são diferentes");
		}

	}

}
