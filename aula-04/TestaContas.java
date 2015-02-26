public class TestaContas {
	public static void main(String[] args) {

		Conta conta = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		conta.deposita(1000); 
		cc.deposita(1000);
		cp.deposita(1000);

		conta.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println("Conta:" + conta.getSaldo());
		System.out.println("Conta Corrente:" + cc.getSaldo());
		System.out.println("Conta Poupança:" + cp.getSaldo());

	}
}
