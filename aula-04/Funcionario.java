public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	public Data setdataEntrada;
	private String rg;
	private int identificador;
	
	
	//construtor para identificador
	public int getIdentificador(){
		return this.identificador++;
	}

	// Construtor
	public Funcionario() {

	}

	public Funcionario(String nome) {
		this.nome = nome;
	}

	// Getter e Setters da classe Funcionarios

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

//	public Data getDataEntrada() {
//		return this.dataEntrada;
//	}
//
//	public void setDataEntrada(Data dataEntrada) {
//		this.dataEntrada = dataEntrada;
//	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	// Metodos da classe
	public void recebeAumento(double aumentaSalario) {
		this.salario += aumentaSalario;

	}

	public double calcularGanhoAnual() {
		return this.salario * 12;

	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario atual: " + this.salario);
		System.out.println("Data de entrada: " + this.setdataEntrada.formatada());
		System.out.println("Rg: " + this.rg);
		System.out.println("Ganho anual: " + this.calcularGanhoAnual());
		System.out.println("  ");
	}

}
