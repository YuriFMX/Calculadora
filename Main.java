import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Calculadora de 4 operações");
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado;
        switch (operacao) {
            case '+':
                resultado = calc.somar(valor1, valor2);
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = calc.subtrair(valor1, valor2);
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = calc.multiplicar(valor1, valor2);
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                try {
                    resultado = calc.dividir(valor1, valor2);
                    System.out.println("Resultado: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}
