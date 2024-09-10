import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codFuncionario = sc.nextInt();
        double horasTrabalhadas = sc.nextDouble();
        double salarioHora = sc.nextDouble();

        double salarioTotal = horasTrabalhadas * salarioHora;

        System.out.println("NUMBER = " + codFuncionario);
        System.out.printf("SALARY = U$ " + salarioTotal);

        sc.close();

    }
}