public class OperadoresAritmeticos {

    public static void main(String[] args){
        Integer adicao = 1+1;
        System.out.println("adicao: " + adicao);

        Integer subtracao = 1-1;
        System.out.println("subtracao: " + subtracao);

        Integer multiplicacao = 2*2;
        System.out.println("multiplicacao: " + multiplicacao);

        Integer divisao = 4/2;
        System.out.println("divisao: " + divisao);

        Integer modulo = 8%2; // é o resto da divisão
        System.out.println("módulo: " + modulo);

        Integer precedencia01 = 1 + 1 * 5; // precedencia no java é multiplicacao, divisao, modulo, soma e subtracao, sendo da esquerda para a direita
        System.out.println("precedência 01: " +precedencia01);

        Integer precedencia02 = (1 + 1) * 5; // quando colocado o parentense eu disse que o que esta dentro do parenteses fosse resolvido antes do que estivesse fora
        System.out.println("precedência 02: " +precedencia02);

        Integer precedencia03 = 5 * (1 + 1); // quando colocado o parentense eu disse que o que esta dentro do parenteses fosse resolvido antes do que estivesse fora
        System.out.println("precedência 03: " +precedencia03);

        Integer precedencia04 = 5 * (1 + 1) + 2; // quando colocado o parentense eu disse que o que esta dentro do parenteses fosse resolvido antes do que estivesse fora
        System.out.println("precedência 04: " +precedencia04);

        Integer precedencia05 = 5 * ((1 + 1) + 2); //  priorizando todas as somas
        System.out.println("precedência 05: " +precedencia05);


        Integer cinco = 5;
        Integer um = 1;
        Integer precedenciaComVariaveis = cinco * (um + um);
        System.out.println("precedencia com variaveis: " + precedenciaComVariaveis);
    }
}
