public class MediaEmpresa {
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;
        int total = janeiro + fevereiro + marco;
        int media = total/3;

        
        System.out.println("Despesa total: R$ "+total);
        System.out.println("Média mensal de gastos: R$ "+media);
    }
}
