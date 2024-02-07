package ex004;

public class Fatorial {
    public static void main(String[] args) {
        int num = 5;
        int f = 1;

        while (num > 0) {
            f = f * num;
            num = num - 1;
        }
        System.out.println(f);
    }
}