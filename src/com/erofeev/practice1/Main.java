import com.erofeev.practice1.ReverseLetter;

void main() {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Input: ");
        String inputString = scanner.nextLine();

        System.out.println("Output: " + ReverseLetter.reverseLetters(inputString));
    }
}