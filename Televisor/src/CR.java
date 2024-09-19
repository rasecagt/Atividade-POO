public class CR {

    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor(10,new String("10 polegadas"),new String("Gradiente"));
        TelevisorComDVD tvdvd1 = new TelevisorComDVD();
        System.out.println("O objeto tv1 é " + tv1.getModelo());
        System.out.println("O objeto tv2 é " + tv2.getModelo());
        System.out.println("O objeto tvdvd1 é " + tvdvd1.getModelo());
        tv1.setModelo("SAMSUNG");
        tv1.setCanal(5);
        tv1.setTamanho("70 polegadas");
        System.out.println("O objeto tv1 agora é " + tv1.getModelo());
        System.out.println("O objeto tv1 está no canal " + tv1.getCanal());
        System.out.println("O objeto tv1 tem " + tv1.getTamanho());

        System.out.println("Apertando o botão play do objeto tvdvd1 " + tvdvd1.play());
        System.out.println("Apertando o botão pause do objeto tvdvd1 " + tvdvd1.pause());
        System.out.println("Apertando o botão stop do objeto tvdvd1 " + tvdvd1.stop());
        System.out.println("Apertando o botão eject do objeto tvdvd1 " + tvdvd1.eject());

    }

}