class MultiplyFun 
{
    static int Multiply(int a,int b)
    {
    return a*b;
    }
    static double Multiply(double a,double b)
    {
        return a*b;
    }
}
class Multiply
{
    public static void main(String[] args) {
     System.out.println(MultiplyFun.Multiply(10, 10));
     System.out.println(MultiplyFun.Multiply(2.0, 4.9));
    }
}