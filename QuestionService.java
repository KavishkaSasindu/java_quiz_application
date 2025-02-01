import java.util.Scanner;

public class QuestionService {

    int score = 0;

    // create question array
    Question question[] = new Question[5];

    public QuestionService() {
        question[0] = new Question(1, "Capital Of SriLanka ?", "Colombo", "Polonnaruwa", "Sri-Jayawardhanapura",
                "Jaffna", "Sri-Jayawardhanapura");
        question[1] = new Question(2, "Capital of France?", "Lyon", "Marseille", "Paris", "Toulouse", "Paris");

        question[2] = new Question(3, "Largest planet in our solar system?", "Saturn", "Earth", "Mars", "Jupiter",
                "Jupiter");

        question[3] = new Question(4, "What is the chemical symbol for water?", "O2", "CO2", "H2O", "N2", "H2O");

        question[4] = new Question(5, "Which year did World War II end?", "1943", "1945", "1939", "1950", "1945");

    }

    // to print questions
    public void playQuiz() {
        for(Question q:question) {
            System.out.println("Question id :"+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.println("");
            System.out.print("Your answer :");
            Scanner input = new Scanner(System.in);

            String userAnswer = input.nextLine();

            if(userAnswer.equals(q.getAnswer())) {
                score  = score + 10;
                
            }
            System.out.println("");
            System.out.println("Your total Score \n"+score); 
        }
    }
}