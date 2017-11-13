import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_command;
        System.out.println("Hello World!");
        do {
            System.out.println("*Jeżeli chcesz wyjść z programu wpisz \"Exit\", a następnie wciśnij klawisz Enter.");
            user_command = sc.nextLine();
        } while (!user_command.equals("Exit"));
    }
}
