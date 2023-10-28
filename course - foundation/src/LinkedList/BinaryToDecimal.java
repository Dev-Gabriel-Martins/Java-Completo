import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número binário: ");
        String binaryString = scanner.nextLine();

        int decimalNumber = convertBinaryToDecimal(binaryString);
        System.out.println("O número decimal equivalente é: " + decimalNumber);

        scanner.close();
    }

    public static int convertBinaryToDecimal(String binaryString) {
        int decimalNumber = 0;
        int n = binaryString.length();

        for (int i = n - 1; i >= 0; i--) {
            int digit = binaryString.charAt(i) - '0';
            decimalNumber += digit * Math.pow(2, n - i - 1);
        }

        return decimalNumber;
    }
}
