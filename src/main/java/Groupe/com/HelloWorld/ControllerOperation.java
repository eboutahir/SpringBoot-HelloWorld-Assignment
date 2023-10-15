package Groupe.com.HelloWorld;

public class ControllerOperation
{
    int x=10;
    int y=5;
    int sum=x+y;
    boolean isGreaterThan =x > y;
    boolean isTrue =true && false;
    public static int add(int a, int b)
    {
        return a+b;
    }

    public static void main (String[] args)
    {
        int result = add(3,4);
        System.out.println(result);
    }
}
