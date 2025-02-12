import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int T = entrada.nextInt();

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();
        int E = entrada.nextInt();

        int i=0;

        if (A == T) {
            i++;
        }
        if (B == T) {
            i++;
        }
        if (C == T) {
            i++;
        }
        if (D == T) {
            i++;
        }
        if (E == T) {
            i++;
        }

        System.out.println(i);
        entrada.close();
    }
}