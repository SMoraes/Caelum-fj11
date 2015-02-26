
public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastoJaneiro = 15000,
			    gastoFevereiro = 23000,   
			    gastoMarco =17000;

			int gastoTrimestral = gastoJaneiro + gastoFevereiro + gastoMarco;
			System.out.println("Esse e o gasto Trimestral = " + gastoTrimestral);
			int mediaMensal = gastoTrimestral/3;
			System.out.println("Valor da media mensal = "+ mediaMensal);		
		}

	}

