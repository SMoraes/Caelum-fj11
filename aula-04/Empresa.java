public class Empresa {
	private String nome = "S.A Computadores";
	private String cnpj = "548.762.565/5555-60";
	private Funcionario[] empregado;
	private int contado;
	
	//Metodo para arrays de Funcionario
	/*
	public Funcionario getFuncionario(int posicao){
		return this.empregado[posicao];
	}
	*/
	
	// Getters e Setters da classe
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void getCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Funcionario[] empregado) {
		this.empregado = empregado;
	}

	public int getContado() {
		return contado;
	}

	public void setContado(int contado) {
		this.contado = contado;
	}

	// Metodos da classe
	void adiciona(Funcionario f) {
		if (this.contado < this.empregado.length) {
			this.empregado[this.contado++] = f;
		} else if (this.contado == this.empregado.length) {

			System.out.println("Já estamos em exesso!" + "\n");
		}
	}

	void mostraEmpregados() {
		System.out
				.println("EMPRESA: " + this.nome + "\n" + "CNPJ:" + this.cnpj);

		for (int i = 0; i < this.empregado.length; i++) {
			System.out.println(" ");
			System.out.println("Funcionario na posicão: " + i);
			// System.out.println(" ");
			// System.out.println("Nome: " + empregado[i].nome);
			// System.out.println("Departamento: " + empregado[i].departamento);
			// System.out.println("Salario do empregado: " +
			// empregado[i].salario);
			// System.out.println("Data de entrada na empresa: "
			// + empregado[i].dataEntrada.formatada());
			// System.out.println("Rg: " + empregado[i].rg);
			//
			this.empregado[i].mostra();

		}

	}

	boolean contem(Funcionario f) {
		for (int i = 0; i < empregado.length; i++) {
			if (f == empregado[i]) {

				System.out.println("Funcionario já trabalha nessa empresa!");
				System.out.println("Nome:" + empregado[i].getNome());
				System.out.println(" ");
				return true;
			}
		}
		System.out.println("Funcionario não trabalha conosco!");
		System.out.println(" ");
		return false;
	}
}
