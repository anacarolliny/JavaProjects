import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        Double resultado = null;

        /*O metodo Do While é um loop que primeiro executa seu corpo e depois checa sua condição
        caso a condição seja true ele refaz o procedimento de seu corpo até que a condição
        seja false. nesse caso usamos o check para essa condição*/
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

            /*O metodo switch recebe uma variavel e age conforme o seu valor nos cases.
            Caso o valor inputado seja diferente dos valores válidos(input < 1 ou input > 4)
            ele ativa o default com a mensagem de valor inválido. e atriubiu a variavel check o valor de false*/
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

            /*Uma variavel sozinha quando do tipo boolean dentro de uma condição é o mesmo que
            perguntar se check == true. assim como tendo o sinal de ! antes desta variavel
            é o mesmo que a condição perguntar se check == false. enquanto check for FALSE
            esse loop se repetirá*/
        }while(!check);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
