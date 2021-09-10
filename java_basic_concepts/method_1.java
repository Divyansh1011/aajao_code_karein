import java.util.Scanner;



public class method_1
{
    public static void main(String[] args) 
    {
        sum();
        Scanner input = new Scanner(System.in);
        int sum = sum1(input.nextInt(), input.nextInt());
        System.out.println(sum);

        input.close();
    }

    //making one function 


    public static int sum1(int a, int b)
    {
        int sum1 = a + b;
        return sum1;

    }
    public static void sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first digt");
        int num = in.nextInt();
        System.out.println("Enter the seconed digit");
        int num1 = in.nextInt();

        int sum = num + num1;

        System.out.println("the sum is"+ sum);

        in.close();

    }

}   