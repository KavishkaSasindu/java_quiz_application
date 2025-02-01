public class QuestionService {

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
    public void displayQuestions() {
        for(Question q:question) {
            System.out.println(q.toString());
        }
    }
}