
public class Condicoes {

	private static final String NOVE = "9";
	private static final String OITO = "8";
	private static final String SETE = "7";
	private static final String SEIS = "6";
	private static final String CINCO = "5";
	private static final String QUATRO = "4";
	private static final String TRES = "3";
	private static final String DOIS = "2";
	private static final String UM = "1";

	public Numero getNumero(String valor) {
		if (valor.equals(UM)) {
			return new NumeroUm();
		} else if (valor.equals(DOIS)) {
			return new NumeroDois();
		} else if (valor.equals(TRES)) {
			return new NumeroTres();
		} else if (valor.equals(QUATRO)) {
			return new NumeroQuatro();
		} else if (valor.equals(CINCO)) {
			return new NumeroCinco();
		} else if (valor.equals(SEIS)) {
			return new NumeroSeis();
		} else if (valor.equals(SETE)) {
			return new NumeroSete();
		} else if (valor.equals(OITO)) {
			return new NumeroOito();
		} else if (valor.equals(NOVE)) {
			return new NumeroNove();
		} else  {
			return new Zero();
		}

	}

}
