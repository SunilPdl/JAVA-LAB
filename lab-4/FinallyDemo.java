class FinallyDemo
{
    //Through an exception out of the method.
    static void firstFunction()
    {
        try{
            System.out.println("Inside firstFunction.");
            throw new RuntimeException("Demo");
        }finally{
            System.out.println("firstFunction's finally. ");
        }
    }

    //Return from within a try block,
    static void secondFunction()
    {
        try{
            System.out.println("Inside secondFunction.");
            return;
        }finally{
            System.out.println("secondFunction's finally.");
        }
    }

    //Execute a try block normally.
    static void thirdFunction()
    {
        try{
            System.out.println("Inside third.");
        }finally{
            System.out.println("thirdFunction's finally.");
        }
    }
    public static void main(String[] args)
    {
        try{
            firstFunction();
        }catch(Exception e){
            System.out.println("Exception caught.");
        }

        secondFunction();
        thirdFunction();
    }
}