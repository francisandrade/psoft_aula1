public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("bike", "Caloi", 150.00);
        System.out.println(p.toString());

        Lote l = new Lote(p, 1, "12/12/2022");
        System.out.println(l.toString());
    }
}
