public class Main {
    public static void main(String[] args) {
        System.out.println("Hello-Quizers");

        System.out.println();

        // question service object

        QuestionService service = new QuestionService();

        service.displayQuestions();
    }
}