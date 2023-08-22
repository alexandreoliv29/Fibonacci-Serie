import java.util.*;

class Fibonacci {
    public static void main(String[] args) {

        ArrayList<Integer> sequenciaFibonacci = new ArrayList<Integer>();

        sequenciaFibonacci.add(0);
        sequenciaFibonacci.add(1);

        for (int i = 2; i < 50; i++) {
            sequenciaFibonacci.add(sequenciaFibonacci.get(i - 1) + sequenciaFibonacci.get(i - 2));
        }

        System.out.println("sequenciaFibonacci depois: " + sequenciaFibonacci);

        descobrirEnesimo(sequenciaFibonacci);

    }

    public static void descobrirEnesimo(ArrayList<Integer> sequenciaFibonacci) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numeroDigitado = myScanner.nextInt();

        System.out.println("O enésimo numero da sequencia e: " + sequenciaFibonacci.get(numeroDigitado));

    }

}