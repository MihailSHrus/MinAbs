import java.util.*;

public class MinAbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое вещестевенное число: ");
        float fnum1 = scanner.nextFloat();
        System.out.println("Вы ввели: " + fnum1);
        System.out.println("Введите второе вещестевенное число: ");
        float fnum2 = scanner.nextFloat();
        System.out.println("Вы ввели: " + fnum2);
        System.out.println("Введите третье вещестевенное число: ");
        float fnum3 = scanner.nextFloat();
        System.out.println("Вы ввели: " + fnum3);
        float x = fnum1 < 0 ? -fnum1 : fnum1;
        float y = fnum2 < 0 ? -fnum2 : fnum2;
        float z = fnum3 < 0 ? -fnum3 : fnum3;
        if (x<=y && x<=z) {
            System.out.print("Минимальное число по модулю из введённых - ");
            System.out.printf("%.2f", fnum1);
        } else if (y<=x && y<=z) {
            System.out.print("Минимальное число по модулю из введённых - ");
            System.out.printf("%.2f", fnum2);
        } else {
            System.out.print("Минимальное число по модулю из введённых - ");
            System.out.printf("%.2f", fnum3);
        }
    }
}