public class AtualizadorDeContas {
	private double saldoTotal;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo antes da atualização: " + c.getSaldo());
		c.atualiza(this.selic);
		
		System.out.println("Saldo depois da atualizao: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();

		System.out.println(" "); 
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

}
