public class Calculadora {
    public double somar(final double valor1, final double valor2) {
        return valor1 + valor2;
    }

    public double subtrair(final double valor1, final double valor2) {
        return valor1 - valor2;
    }

    public double multiplicar(final double valor1, final double valor2) {
        return valor1 * valor2;
    }

    public double dividir(final double valor1, final double valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return valor1 / valor2;
    }
}
