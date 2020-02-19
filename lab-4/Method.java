import java.io.*;
class ExceptionThrows
{
    void method() throws IOException{
        throw new IOException(" error");
    }
}

class Method{
    public static void main(String[] args) throws IOException
    {
        ExceptionThrows th = new ExceptionThrows();
        try {
            th.method();

        }

        System.out.println("program continue....");
    }
}