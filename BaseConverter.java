import java.util.Scanner;
import java.util.Stack;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número em decimal: ");
        int num = scanner.nextInt();

        System.out.println("""
                Para qual base você deseja converter? \
                
                1- Base binária \
                
                2- Base octal \
                
                3- Base hexadecimal \
      
                Insira sua opção: \s""");
        int opt = scanner.nextInt();

        Stack<String> stack = new Stack<>();
        int quocient = num;
        String digits = "0123456789ABCDEF";

        switch (opt) {
            case 1:
                while (quocient != 0) {
                    int remainder = quocient % 2;
                    quocient = quocient / 2;
                    String binary = Integer.toString(remainder);
                    stack.push(binary);
                }
                System.out.println(stack.reversed() );
                break;

            case 2:
                while (quocient != 0) {
                    int remainder = quocient % 8;
                    quocient = quocient / 8;
                    String octal = Integer.toString(remainder);
                    stack.push(octal);
                }

            case 3:
                while (quocient != 0) {
                    int remainder = quocient % 16;
                    quocient = quocient / 16;
                    String hex = Character.toString(digits.charAt(remainder));
                    stack.push(hex);
                }
                System.out.println(stack.reversed());
                break;
        }
    }
}
