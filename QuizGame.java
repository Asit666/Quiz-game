import java.util.Scanner;

public class QuizGame {
    
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("-----------------------welcome-----------------------");

        String[] questions = {"what is the capital of France?", "which language is used for Android development?","who developed Java"};

        String[][] options = {{"A. Paris","B. Berlin","C. Madria","D. Rome"} ,{"A. Swift", "B. Kotlin", "C. JavaScript","D. Python"}, {"A. James Gosling","B. Bjarne Stroustrup","C. Guido Van Rossum", "D. Dennis Ritchie"}};
        
        String[] answers = {"A", "B", "A"};

        int score = 0;
        for (int i = 0; i< questions.length; i++)
        {
            System.out.println(questions[i]);
            for(String option : options[i])
            {
                System.out.println(option);
            }
            System.out.print("Choose the correct answer : ");
            
            String userAnswer = A.nextLine().toUpperCase();

            if (userAnswer.equals(answers[i]))
            { System.out.println("Correct answer +1");
                score++;
            }
            else
            { System.out.println("Wrong answer, the correct answer is " + answers[i]);}
        }
        System.out.println("Your total score is " + score + " Out of " + questions.length);
    }
}
