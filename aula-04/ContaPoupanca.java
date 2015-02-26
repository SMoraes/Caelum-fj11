public class ContaPoupanca extends Conta {
	
	public void atualiza(double taxa) {
		//this.saldo += super.saldo * taxa * 3; Metodo anterior
		super.atualiza(taxa*3);
	}
}
