public class Main {
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao("PT-ABC", "LATAM");
        Aviao aviao2 = new Aviao("PR-XYZ", "GOL");
        Aviao aviao3 = new Aviao("PP-DEF", "Azul");
        Aviao aviao4 = new Aviao("PS-KLM", "Avianca");
        Aviao aviao5 = new Aviao("PT-JET", "Itapemirim");

        FilaAviao fila1 = new FilaAviao(3);

        fila1.enfileirar(aviao1);
        fila1.enfileirar(aviao3);
        fila1.enfileirar(aviao4);
        fila1.enfileirar(aviao5);

        System.out.println("Aviões na fila de decolagem:");
        for (Aviao a : fila1.getFila()) {
            if (a != null) {
                System.out.println(a);
            }
        }

        System.out.println(fila1.desenfileirar());

        System.out.println("Aviões na fila de decolagem:");
        for (Aviao a : fila1.getFila()) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }
}
