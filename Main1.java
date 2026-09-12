import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Nhập số lượng tung cần quay: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {

            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("Bạn đã tung: " + roll);
                total = total + roll;
            }
            System.out.println("Tổng: " + total);
        } else {
            System.out.println("Số xúc xắc phải lớn hơn 0");
        }
        scanner.close();
    }
    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 ------- 
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 ------- 
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 ------- 
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 ------- 
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 ------- 
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 ------- 
                """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }
    }
}
