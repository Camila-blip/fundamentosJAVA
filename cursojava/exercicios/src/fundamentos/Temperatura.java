package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double FATOR = 5.0 /9.0;
		final double AJUSTE = 32;
		double valortotal = 86;
		double c = (valortotal - AJUSTE) * FATOR;
		System.out.println("O resultado � " + c + "�C.");
	}
}
