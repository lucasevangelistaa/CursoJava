public class Fibonacci {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;

        while (primeiro <= 100) {
            System.out.print(primeiro+" -> ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println("FIM");
    }
}