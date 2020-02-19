class ExceptionTryCatch
{
    public static void main(String[] args)
    {
      int a,b;
      try
      {
        b=0;
        a=35/b;
        System.out.println("This is not printed. ");
      }catch(ArithmeticException e)//catch divide-by-zero error
        {
            System.out.println("Division by zero.");
        }
        System.out.println("After catched statement.");
    }
}