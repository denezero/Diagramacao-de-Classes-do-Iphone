public class IPhone {
    private String modelo;
    private String cor;
    private boolean ligado;

    public IPhone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("iPhone ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("iPhone desligado.");
    }

    public boolean isLigado() {
        return ligado;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }
}