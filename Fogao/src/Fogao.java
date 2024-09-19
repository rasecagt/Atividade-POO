public class Fogao {

    private int bocas;
    private String cor;
    private String marca;
    private String modelo;


    Fogao() {
        bocas = 5;
        cor = "Preta";
        marca = "Electrolux";
        modelo = "FE5GP";
    }


    Fogao(int t, String c, String m, String model) {
        bocas = t;
        cor = c;
        marca = m;
        modelo = model;
    }




    public int getBocas() {
        return bocas;
    }

    public void setBocas(int t) {
        this.bocas = t;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Fogao f1;
        Fogao f2;
        Fogao f3;


        f1 = new Fogao();
        f2 = new Fogao(2,"Cinza","Brastemp","BFS5VCE");


        System.out.println("O objeto f1 tem as seguintes caracteristicas:");
        System.out.println("Temperatura: " + f1.getBocas());
        System.out.println("Cor: " + f1.getCor());
        System.out.println("Marca: " + f1.getMarca());
        System.out.println("Modelo: " + f1.getModelo());
        System.out.println("O objeto f2 tem as seguintes caracteristicas:");
        System.out.println("Temperatura: " + f2.getBocas());
        System.out.println("Cor: " + f2.getCor());
        System.out.println("Marca: " + f2.getMarca());
        System.out.println("Modelo: " + f2.getModelo());

    }

}