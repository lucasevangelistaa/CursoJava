public class Variaveis {
    public static void main(String[] args) {
        // Variáveis do tipo INT (Inteiro)
        int idade;
        idade = 18;
        System.out.println(idade);

        int n1 = 5;
        int n2 = 5;
        int soma = n1 + n2;
        System.out.println(soma);

        // Variáveis do tipo DOUBLE (Flutuante/valores reais)
        double pi = 3.14;
        double x = 5 * 10;
        System.out.println("O valoar de PI é "+pi);
        System.out.println("5 * 10 = "+x);

        // Variáveis do tipo BOOLEAN (True/False)
        int calculo = 10 + 2 - 3;
        boolean result = calculo > 9;
        System.out.println(result);

        // Variáveis do tipo CHAR (O tipo char guarda um, e apenas um, caractere. Este deve estar entre aspas simples.)
        char letra = 'a';
        System.out.println(letra);
    }
}