import java.util.Scanner;

public class dycrypt {
    public static String decrypt(String encryptedText, int shift) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < encryptedText.length(); i++) {
            char ch = encryptedText.charAt(i);

            if (Character.isLetter(ch)) {
                char shiftedChar = (char) (ch - shift);

                if (Character.isUpperCase(ch)) {
                    shiftedChar = (char) ((shiftedChar - 'A' + 26) % 26 + 'A');
                } else {
                    shiftedChar = (char) ((shiftedChar - 'a' + 26) % 26 + 'a');
                }

                decryptedText.append(shiftedChar);
            } else {
                decryptedText.append(ch);
            }
        }

        return decryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the encrypted text: ");
        String encryptedText = scanner.nextLine();

        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);

        scanner.close();
    }
}
