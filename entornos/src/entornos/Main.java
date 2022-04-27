package entornos;

public class Main {
	private static boolean valor_maximo;

	public static boolean numeroMaximo(int b, int a){
        setValor_maximo(false);
        if (a>b) {
            setValor_maximo(true);
        } else if (b>a) {
            setValor_maximo(false);
        }
        return isValor_maximo();
	}

	public static void main(String[] args) {
		numeroMaximo(20, 10);
	}

	private static boolean isValor_maximo() {
		return valor_maximo;
	}

	private static void setValor_maximo(boolean valor_maximo) {
		Main.valor_maximo = valor_maximo;
	}
}
