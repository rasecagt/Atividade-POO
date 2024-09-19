public class Automovel {

    private int ano;
    private String cor;
    private String marca;
    private String modelo;


    Automovel() {
        ano = 2010;
        cor = "Prata";
        marca = "Ford";
        modelo = "Ka";
    }


    Automovel(int t, String c, String m, String model) {
        ano = t;
        cor = c;
        marca = m;
        modelo = model;
    }




    public int getAno() {
        return ano;
    }

    public void setAno(int t) {
        this.ano = t;
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
        Automovel a1;
        Automovel a2;
        Automovel a3;


        a1 = new Automovel();
        a2 = new Automovel(1998,"Cinza","Fiat","Uno");
        a3 = new Automovel(2009,"Vermelho", "Ferrari", "296 GTB");


        System.out.println("O objeto a1 tem as seguintes caracteristicas:");
        System.out.println("Ano: " + a1.getAno());
        System.out.println("Cor: " + a1.getCor());
        System.out.println("Marca: " + a1.getMarca());
        System.out.println("Modelo: " + a1.getModelo());
        System.out.println("O objeto a2 tem as seguintes caracteristicas:");
        System.out.println("Ano: " + a2.getAno());
        System.out.println("Cor: " + a2.getCor());
        System.out.println("Marca: " + a2.getMarca());
        System.out.println("Modelo: " + a2.getModelo());
        System.out.println("O objeto a3 tem as seguintes caracteristicas:");
        System.out.println("Ano: " + a3.getAno());
        System.out.println("Cor: " + a3.getCor());
        System.out.println("Marca: " + a3.getMarca());
        System.out.println("Modelo: " + a3.getModelo());


        a1.setAno(2011);
        a2.setAno(2020);
        a3.setAno(1999);


        System.out.println("O objeto a1 tem as seguintes caracteristicas:");
        System.out.println("Ano: " + a1.getAno());
        System.out.println("Cor: " + a1.getCor());
        System.out.println("Marca: " + a1.getMarca());
        System.out.println("Modelo: " + a1.getModelo());
        System.out.println("O objeto a2 tem as seguintes caracteristicas:");
        System.out.println("Temperatura: " + a2.getAno());
        System.out.println("Cor: " + a2.getCor());
        System.out.println("Marca: " + a2.getMarca());
        System.out.println("Modelo: " + a2.getModelo());
        System.out.println("O objeto a3 tem as seguintes caracteristicas:");
        System.out.println("Temperatura: " + a3.getAno());
        System.out.println("Cor: " + a3.getCor());
        System.out.println("Marca: " + a3.getMarca());
        System.out.println("Modelo: " + a3.getModelo());

    }

}