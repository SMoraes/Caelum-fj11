public class Banco {
	private Conta[] contas;
	private int capacidade, numContas = 0;

	public Banco(int capacidade) {
		this.capacidade = capacidade;
		contas = new Conta[this.capacidade];
	}

	public void adiciona(Conta c) {
		if (numContas < capacidade) {
			contas[numContas] = c;
			numContas++;
		} else {
			System.out.println("Numero de contas no limite!");
		}
	}

	public Conta pegaConta(int x) {
		if (x < capacidade) {
			return contas[x];
		} else {
			System.out.println("Essa conta n�o existe!");
			return null;
		}
	}
	
	public int pegaTotalDeContas(){
		return this.numContas;
	}

}
