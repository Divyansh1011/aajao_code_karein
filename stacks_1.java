import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class stacks_1 {



    public static boolean check(String exp)
    {
        Deque<Character> stack = new ArrayDeque<Character>();
        //made doubley queue for the stack operations 

        //traversing the string 
        for(int i = 0; i<exp.length();i++)
        {
            char x  = exp.charAt(i);

            if(x == '(' || x == '{' || x == '[')
            {
                stack.push(x);
            }

            if(stack.isEmpty())
            {
                return false;
            }
            char check;
            switch(x)
            {
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[')
                    {
                        return false;
                    }
                    break;

                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '[')
                    {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '{' || check == '(')
                    {
                        return false;
                    }
                    break;                
            }
        }

        return (stack.isEmpty());


        

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String exp = input.next();

        if(check(exp))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(
                false
            );
        }
        
    }
}
