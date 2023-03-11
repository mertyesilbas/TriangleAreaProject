import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // Create Variables
        double firstSide, secondSide, thirdSide, semiPerimeter, area;

        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Take Inputs
        System.out.println("Alanını hesaplamak istediğiniz üçgenin kenar uzunluklarını giriniz: " + "\n" + "Birinci Kenar Uzunluğu: ");
        firstSide = Math.abs(scanner.nextDouble());
        System.out.println("İkinci Kenar Uzunluğu: ");
        secondSide = Math.abs(scanner.nextDouble());
        System.out.println("Üçüncü Kenar Uzunluğu: ");
        thirdSide = Math.abs(scanner.nextDouble());

        // Calculations
        semiPerimeter = (firstSide + secondSide + thirdSide) / 2;
        area = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
        System.out.println("Üçgenin Alanı: " + df.format(area));
    }
}