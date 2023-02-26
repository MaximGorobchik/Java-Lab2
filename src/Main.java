import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        Task_1_2(30);
        System.out.println("\nЗадача 2:");
        System.out.print("Введіть кут в градусах: ");
        Scanner scan = new Scanner(System.in);
        String angle = scan.next();
        double angle_parse = Double.parseDouble(angle);
        Task_1_2(angle_parse);
    }

    public static void Task_1_2(double angle) {
        double angle_in_radian = Math.toRadians(angle);
        double sin = Math.sin(angle_in_radian);
        double cos = Math.cos(angle_in_radian);
        System.out.format("Sin %.1f = %.2f\n", angle, sin);
        System.out.format("Cos %.1f = %.2f", angle, cos);
    }
}