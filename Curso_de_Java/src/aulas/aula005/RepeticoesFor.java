package aula005;

public class RepeticoesFor {
    public static void main(String[] args) {
        // Estrutura
        /*
            for (inicializção; condição; incremento) {
                codigo...;
            }
        */

        // Exemplo 01 (contando de 1 até 9)
        for (int cont = 1; cont < 10; cont = cont + 1) {
            System.out.println(cont);
        }
        System.out.println("==========");

        // Exemplo 02 (Contado de 0  até 10 pulado de 2 em 2)
        for (int num = 0; num < 11; num = num + 2) {
            System.out.println(num);
        }
    }
}
