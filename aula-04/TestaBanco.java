public class TestaBanco {
	public static void main(String[] args) {
		Conta programador = new Conta();
		Conta programadorCC = new ContaCorrente();
		Conta programadorCP = new ContaPoupanca();
		
		//recebendo o salario
		programador.deposita(5000);
		programadorCC.deposita(5000);
		programadorCP.deposita(5000);
		
		//Objeto que vai atualiazar as contas
		AtualizadorDeContas adc =  new AtualizadorDeContas(0.01); // Metodo é do tipo Double
		
		
		System.out.println("Criando um banco com 3 contas");
		Banco banco =  new Banco(3); // Capacidade de Três contas possiveis 
		banco.adiciona(programador);
		banco.adiciona(programadorCC);
		banco.adiciona(programadorCP);
		
		for (int i = 0; i < banco.pegaTotalDeContas(); i++) {
			System.out.println("\nFuncionario do numero: " + (i+1));
			System.out.println("Saldo: " + banco.pegaConta(i).getSaldo());
			adc.roda(banco.pegaConta(i));
		}
		System.out.println("\nSaldo total: " + adc.getSaldoTotal() );
	}
}
