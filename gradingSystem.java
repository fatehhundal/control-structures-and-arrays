import java.util.*;

public class gradingSystem {
    public static void main(String[] args) {
        int sum = 0;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int noOfSubjects = sc.nextInt();
        int marks[] = new int[noOfSubjects];

        System.out.println("Enter the marks of " + noOfSubjects + " subjects. Press enter to give marks for another subject.");
        // entering marks

        for(int i = 0; i < noOfSubjects;i++){
            marks[i]=sc.nextInt();
        } // calculating sum

        for(int j = 0; j < noOfSubjects; j++){
            sum = sum + marks[j];
        } // generating result

        int percentage = sum/noOfSubjects;
        // can also be written as
        // int percentage = (sum/noOfSubjects*100)*100

        System.out.println("You average is " + percentage + "%");
        if(percentage >= 85) {
            result = "You've scored an A grade. Great work!";
        }

        else if(percentage < 85 && percentage >= 70) {
            result = "You've scored a B grade. Well done!";
        }

        else if(percentage < 70 && percentage >= 50) {
            result = "You've scored a C grade. Good job!";
        }

        else {
            result = "Though you haven't passed, you can still do better!";
        }
        System.out.println(result);
    }
}
