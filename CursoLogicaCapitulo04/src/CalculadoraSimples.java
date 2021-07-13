import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Menu da Calculadora - Escolha qual operação a fazer " + "\n" +
                "Digite 1 para somar | 2  para subtrair | 3 para multiplicar | 4 para dividir  ");
        Integer operacao = scanner.nextInt();

        System.out.println("Esse programa irá fazer uma simples operação com dois numeros");
        System.out.print("Digite o primeiro numero: ");
        Double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        Double segundoNumero = scanner.nextDouble();

        Double resultado = null;

        if (operacao.equals(1)){
                resultado = primeiroNumero + segundoNumero;
        }
        if (operacao.equals(2)){
                resultado = primeiroNumero - segundoNumero;
        }
        if (operacao.equals(3)){
                resultado = primeiroNumero * segundoNumero;
        }
        if (operacao.equals(4)){
                resultado = primeiroNumero / segundoNumero;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    // ESSE É UM TESTE DO GUILHERMEBDP
}
