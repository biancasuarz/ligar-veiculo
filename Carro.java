public class Carro extends Veiculo {

    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("Carro Ligado");
    }
    private void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }

    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO");
    }
}
