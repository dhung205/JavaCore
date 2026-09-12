import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        String[] questions =
                {"Đầu quả trứng ",
                        "Ra dại với ông",
                        "Dí buồi quan tâm",
                        "Không học thì ăn cứt",};
        String[][] options =
                {{"1.Bíp Bíp", "2.Trường Con", "3.Khá Bẩn", "4.Huấn HH"},
                        {"1.Hưng", "2.Bảo", "3.Quảng", "4.Khoai"},
                        {"1.2005", "2.2007", "3.2008", "4.2016"},
                        {"1.Cút", "2.Next", "3.Chịu", "4.Lậy bố"}};

        int[] answers = {3, 1, 2, 4};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*********");
        System.out.println("Chào mừng");
        System.out.println("*********");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("Wrong");
            }
        }
        System.out.println("Tổng số điểm: " + score + " trong " + questions.length);
        scanner.close();
    }
}
