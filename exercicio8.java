import java.util.Scanner;

public class exercicio8 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora e a quantidade de horas trabalhadas no mês.");

        System.out.print("Salário/hora: ");
        double salario = scan.nextDouble();

        System.out.print("Quantidade de horas trabalhadas: ");
        double horas = scan.nextDouble();

        System.out.println("Neste mês você ganhará: " + (salario * horas));
        scan.close();
    }
}
