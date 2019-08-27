package POO;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Olá mundo");

        Contador c = new Contador();
        Contador d = new Contador();

        int i, j;

        i = 10;

        j = 2;

        int h = i + j;

        System.out.println(++h);
        System.out.println(i++);

        System.out.println("Valor atual: " + c.getValorAtual());
        c.incrementa();
        System.out.println("Valor atual: " + c.getValorAtual());

        System.out.println("Valor atual: " + d.getValorAtual());

        Batedeira planetaria = new Batedeira();

        System.out.println();
        System.out.println("Ligando batedeira...");
        planetaria.setLigada(true);
        System.out.println("Batedeira ligada!");

        System.out.println();
        System.out.println("Velocidade da batedeira: " + planetaria.getVelocidade() + " rpm");
        System.out.println("Aumentando velocidade da batedeira em 10 rpm...");
        planetaria.setVelocidade(10);
        System.out.println("Velocidade da batedeira: " + planetaria.getVelocidade() + " rpm");

        System.out.println();
        System.out.println("Desligando batedeira...");
        planetaria.setLigada(false);
    }
}
