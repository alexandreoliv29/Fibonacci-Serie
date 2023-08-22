import java.util.*;

class FibonacciMelhor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int enesimoFibonacci = calcularEnesimoFibonacci(n);
        System.out.println("O " + n + "º número da sequência de Fibonacci é: " + enesimoFibonacci);
    }

    public static int calcularEnesimoFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int fibMinus2 = 0;
        int fibMinus1 = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = fibMinus1 + fibMinus2;
            fibMinus2 = fibMinus1;
            fibMinus1 = fib;
        }

        return fib;
    }
}
