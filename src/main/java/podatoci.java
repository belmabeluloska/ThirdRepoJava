import java.util.Scanner;

public class podatoci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Внеси години: ");
        int godini =20; input.nextInt();
        
        System.out.print("Внеси висина во цм: ");
        double visina = 160;input.nextDouble();
        
        System.out.print("Внеси крвна група (A/B/AB/O): ");
        String krvnaGrupa = input.next();
        
        double kila =50; presmetajKila(godini, visina);
        
        System.out.println("Вашата тежина треба да биде околу " + kila + " кг.");
        System.out.println("Вашата крвна група е: " + krvnaGrupa);
        
        input.close();
    }
    
    public static double presmetajKila(int godini, double visina) {
        double kila;
        if (godini <= 30) {
            kila = 0.5 * godini + 15 + (visina - 150) / 4;
        } else {
            kila = 0.1 * (godini - 30) + 45 + (visina - 150) / 4;
        }
        return kila;
    }
}
