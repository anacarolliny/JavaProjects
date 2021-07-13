import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        * Um Map que armazena as chaves e valores das operações validas.
        * Lembrando que um HashMap não preserva a ordem da inserção e não ordena automaticamente seus elementos.
        * leia mais sobre HashMap em:
        * https://stackoverflow.com/questions/43871017/are-the-hashmap-entries-always-sorted-by-key-if-the-key-is-of-type-integer
        * https://www.funzen.net/po/2019/11/01/diferenca-entre-hashmap-e-linkedhashmap-em-java/
        *
        * Também está sendo utilizado a sintaxe de Double-Brace. O uso dessa sintaxe deve ser evitada por ser
        * considerada um anti-padrão e possuir muitas desvantagens, estou usando para fins de demonstração.
        *
        * A sintaxe de Double-Brace nos permite a criação e inicialização em uma única instrução.
        * exemplo:
        *   sintaxe normal:
        *       Map<Integer, String> operacoesValidas = new HashMap<>();
        *       operacoesValidas.put(1, "somar");
        *       operacoesValidas.put(2, "subtrair");
        *       operacoesValidas.put(3, "multiplicar");
        *       operacoesValidas.put(4, "dividir");
        *
        *
        *    sintaxe Double-Brace:
        *       Map<Integer, String> operacoesValidas = new HashMap<Integer, String>(){{
        *           put(1, "somar");
        *           put(2, "subtrair");
        *           put(3, "multiplicar");
        *           put(4, "dividir");
        *       }};
        *
        *  mais sobre a sintaxe Double-Brace:
        *   https://www.baeldung.com/java-double-brace-initialization
        */
        final Map<Integer, String> operacoesValidas = new HashMap<Integer, String>(4){{
            put(3, "multiplicar");
            put(2, "subtrair");
            put(1, "somar");
            put(4, "dividir");
        }};
        final int tamanhoDoMapDeOpcoes = operacoesValidas.size();
        boolean whileAtivado = true;
        double resultado = 0D;

        while (whileAtivado){
            System.out.println("Menu da Calculadora - Escolha qual operação a fazer\nDigite:");

            operacoesValidas.forEach((chave, valor) -> {
                /*
                * Se a chave for menor que o tamanho do mapa de opções é adicionado uma barra para separar
                * se não pula linha e mostra :
                */
                final String barraSeparadora = chave < tamanhoDoMapDeOpcoes ? " | " : "\n: ";
                System.out.printf("%d para %s" + barraSeparadora, chave, valor);
            });

            // try-catch para lidar com valores não numéricos.
            try {
                final int opcaoDoUsuario = scanner.nextInt();

                if(!operacoesValidas.containsKey(opcaoDoUsuario)) {
                    System.out.println("Opção inválida. Por favor tente novamente!\n------");
                    continue;
                }

                System.out.println("Esse programa irá fazer uma simples operação com dois números.");
                System.out.print("Digite o primeiro numero: ");
                Double primeiroNumero = scanner.nextDouble();
                System.out.print("Digite o segundo numero: ");
                Double segundoNumero = scanner.nextDouble();

                switch (opcaoDoUsuario){
                    case 1:
                        resultado = primeiroNumero + segundoNumero;
                        break;
                    case 2:
                        resultado = primeiroNumero - segundoNumero;
                        break;
                    case 3:
                        resultado = primeiroNumero * segundoNumero;
                        break;
                    case 4:
                        resultado = primeiroNumero / segundoNumero;
                        break;
                }

                whileAtivado = false;
            } catch (Exception error){
                System.out.println("Por favor insira apenas valores validos.\n------");
            }
        }

        System.out.print("Resultado: " + resultado);
        scanner.close();
    }
}
