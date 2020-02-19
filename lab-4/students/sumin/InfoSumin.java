package sumin;
public class InfoSumin
{
    int Roll;
    String Name;
    String Address;
    //Creating a parameterized constructor
   public InfoSumin(int i,String n ,String a)
    {
        Roll = i;
        Name = n;
        Address = a;
    }

   public void display()
    {
        System.out.println("Student roll number:" +Roll);
        System.out.println("Student name :" +Name);
        System.out.println("Student address:" +Address);
    } 
}