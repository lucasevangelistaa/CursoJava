package aula004;

public class RepeticoesWhile {
    public static void main(String[] args) {
        // Exemplo 01
        int idade = 15;
        while (idade < 18) {
            System.out.println(idade);
            idade = idade + 1;
        }

        // Exemplo 02 (cotando de 0 até 9)
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador = contador + 1;
        }
    }
}
