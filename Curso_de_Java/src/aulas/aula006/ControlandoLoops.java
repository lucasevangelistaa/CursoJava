package aula006;

public class ControlandoLoops {
    public static void main(String[] args) {
        // Exemplo01 Os números de x a y e irá parar quando encontrar um número
        // divisível por 19, uma vez que foi utilizada a palavra-chave "break".
        int x = 10;
        int y = 30;
        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei um número	divisível por 19 entre x e y");
                break;
            }
        }
    }
}
