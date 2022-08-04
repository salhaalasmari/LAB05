import java.util.Scanner;

public class Totrial04 {
    public static void main(String[] args) {
        System.out.println("---------Q1---------");
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter number 1 ");
        int number1 = in.nextInt();
        System.out.println("please enter number 2");
        int number2 = in.nextInt();
        System.out.println("please choose what you want of operation ");
        String operation = in.next();

        if(operation.equals("+")){
            System.out.println("The summtion is"+(number1+number2));
        } else if (operation.equals("-")) {
            System.out.println("The subtraction is "+(number1-number2));
        } else if (operation.equals("/")) {
            System.out.println("the division is "+(number1/number2));
        } else if (operation.equals("*")) {
            System.out.println("The multiply is "+(number1*number2));
        } else if (operation.equals("%")) {
            System.out.println("The reminder is "+(number1%number2));
        }
        else {
            System.err.println("Warning");
        }
        System.out.println("---------Q2---------");
        Scanner input = new Scanner(System.in);
        int random = (int)(Math.random() * 3);
        System.out.print(" the rules of these are : " +
                "scissor (0)\n, rock (1)\n, paper (2):\n  ");
        int user = input.nextInt();
        System.out.print("The computer is ");
        switch (random)
        {
            case 0: System.out.print("it is a scissor."); break;
            case 1: System.out.print("it is a rock."); break;
            case 2: System.out.print("it is a paper.");
        }
        System.out.print(" so , You are ");
        switch (user)
        {
            case 0: System.out.print("it is a scissor."); break;
            case 1: System.out.print("it is a rock."); break;
            case 2: System.out.print("it is a paper. ");
        }
        if (random == user)
            System.out.println(" too. It is a draw");
        else
        {
            boolean win = (user == 0 && random == 2) ||
                    (user == 1 && random == 0) ||
                    (user == 2 && random == 1);
            if (win)
                System.out.println(". You won ..");
            else
                System.out.println(". You lose .. please again");
        }

    }

}
