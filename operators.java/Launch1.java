// Incrementation and Decrementation
class Launch1
{
    public static void main(String []args)
    {
        // int a=5;
        // a++;
        // System.out.println(a);
        // a--;
        // System.out.println(a);
        int a=5;
        int b=a++ + ++a + ++a + a++ + --a + a--;
        System.out.println(b);
    }
}