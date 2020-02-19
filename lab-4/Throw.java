//It is a sample program that creats and throw an exception.
//The handler that catches the exception rethrow it to the outer handler.
class Throw
{
    static void demo()
    {
        try{
            throw new NullPointerException("Demo");
        }catch(NullPointerException e){
            System.out.println("Caught inside demo.");
            throw e;//rethrow throw exception
        }
    }
    public static void main(String[] args)
    {
        try{
            demo();
        }catch(NullPointerException e){
            System.out.println("Recaught:" +e);
        }
    }
}