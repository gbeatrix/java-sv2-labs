package abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise[] exercises = new MathExercise[4];
        exercises[0] = new Adder();
        exercises[1] = new Subtracter();
        exercises[2] = new Multiplier();
        exercises[3] = new Divisor();

        for (MathExercise exercise : exercises) {
            System.out.println(exercise.getSolution(100, 7));
        }
    }
}
