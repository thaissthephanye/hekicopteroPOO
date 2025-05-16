public class Principal {
    public static void main(String[] args) {
        Helicoptero h = new Helicoptero( 5);
        System.out.println("------HELICOPTERO B550M------");
        System.out.println(h);

        h.addPessoas();
        h.addPessoas();
        h.addPessoas();
        h.addPessoas();
        h.ligar();
        h.decolar();
        System.out.println(h);

        h.aterrissar();
        h.desligar();
        h.removerPessoas();
        h.removerPessoas();
        h.removerPessoas();
        h.removerPessoas();
        System.out.println(h);

        Helicoptero h2 = new Helicoptero( 10);
        System.out.println("-----HELICOPTERO A340-----");
        System.out.println(h2);

        h2.addPessoas();
        h2.addPessoas();
        h2.addPessoas();
        h2.addPessoas();
        h2.ligar();
        h2.decolar();
        System.out.println(h2);

        h2.aterrissar();
        h2.desligar();
        h2.removerPessoas();
        h2.removerPessoas();
        h2.removerPessoas();
        h2.removerPessoas();
        System.out.println(h2);
    }
}
