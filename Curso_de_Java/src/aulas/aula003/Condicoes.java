package aula003;

public class Condicoes {
    public static void main(String[] args) {
        int numero = 4;
        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }


        // IF e ELSE com Operadores Lógicos
        // O "E" é representado pelo && e o "OU" é representado pelo ||

        // Verifiacar se a pessoa já pode votar
        int idade = 15;
        if (idade < 16) {
            System.out.println("Não vota!");
        } else if (idade < 18 || idade > 65) {
            System.out.println("Voto Opcional!");
        } else {
            System.out.println("Voto Obrigatório!");
        }

        // Comparando variáveis com o operador de igualdade "=="
        int n1 = 2;
        int n2 = 3;
        if (n1 == n2) {
            System.out.println("Números iguais!");
        } else {
            System.out.println("Números diferentes!");
        }
    }
}
