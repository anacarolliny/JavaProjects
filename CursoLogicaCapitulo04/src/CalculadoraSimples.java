import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        Double resultado = null;

        do {
            check = true;
            System.out.print("Menu da Calculadora - Escolha qual operação a fazer " + "\n" +
                    "Digite 1 para somar | 2  para subtrair | 3 para multiplicar | 4 para dividir  ");
            Integer operacao = scanner.nextInt();

            System.out.println("Esse programa irá fazer uma simples operação com dois numeros");
            System.out.print("Digite o primeiro numero: ");
            Double primeiroNumero = scanner.nextDouble();
            System.out.print("Digite o segundo numero: ");
            Double segundoNumero = scanner.nextDouble();

            switch (operacao) {
                case (1): {
                    resultado = primeiroNumero + segundoNumero;
                    break;
                }
                case (2): {
                    resultado = primeiroNumero - segundoNumero;
                    break;
                }
                case (3): {
                    resultado = primeiroNumero * segundoNumero;
                    break;
                }
                case (4): {
                    resultado = primeiroNumero / segundoNumero;
                    break;
                }
                default: {
                    System.out.println("\n####ERROR####\n" +
                            "Operação escolhida inválida. Escolha novamente" +
                            "\n####ERROR####\n");
                    check = false;
                }
            }
        }while(!check);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
