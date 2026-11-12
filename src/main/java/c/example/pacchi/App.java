
package c.example.pacchi;

public class App {

    public int calculateTotal(int[] marks) {
        validateMarks(marks);

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public double calculateAverage(int[] marks) {
        return calculateTotal(marks) / 5.0;
    }

    public String calculateGrade(double average) {

        if (average < 0 || average > 100) {
            throw new IllegalArgumentException("Invalid average");
        }

        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }

    private void validateMarks(int[] marks) {

        if (marks == null || marks.length != 5) {
            throw new IllegalArgumentException(
                "Exactly five marks are required"
            );
        }

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException(
                    "Marks must be between 0 and 100"
                );
            }
        }
    }
}
