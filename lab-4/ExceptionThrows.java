//This program is Bypass a java error so it is only compiled but not run....
import java.io.*;
class ExceptionThrows
{
    void method()throws IOException{
        throw new IOException(" error");
    }
}

class method{
    public static void main(String[] args)throws IOException
    {
        ExceptionThrows th = new ExceptionThrows();
        th.method();

        System.out.println("program continue....");
    }
}