public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("898787");

        Moto z400 = new Moto();
        z400.setChassi("898754");
        z400.ligar();

    }

}
