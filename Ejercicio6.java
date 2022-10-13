public class Ejercicio6 {
    public static void main(String[] args){
        double baseImponible = 10.50;
        System.out.printf("Base imponible %8.2f\n", baseImponible);
        System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
        System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
    }
}
