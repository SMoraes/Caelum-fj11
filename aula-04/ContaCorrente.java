public class ContaCorrente extends Conta {
	
	public void atualiza(double taxa) {
//		this.saldo += super.saldo * taxa * 2; Metodo anterior
		
		super.atualiza(taxa * 2);
	}
	
	public void deposita(double valor){
		this.saldo += valor - 0.10;
		
	}
}
