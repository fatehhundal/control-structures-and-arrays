import java.util.*;

class helloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello user, please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your liucky number: ");
        int lucky = sc.nextInt();
        System.out.println("Hello " + name + ", your lucky number " + lucky + " shows that you are really hardworking. Keep it up!");
    }
}