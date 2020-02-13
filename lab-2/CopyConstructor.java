class CopyConstructor{
    public String name;
    public boolean isComplete;
    
    public CopyConstructor(){ 	//default constructor
    name="Study Java";
    isComplete=false;
    }
        
    public CopyConstructor(CopyConstructor t1){ 	
    name=t1.name;		//copy constructor
    }
    
    public static void main(String[] args)
    {
    CopyConstructor task1=new CopyConstructor();
    CopyConstructor task2=new CopyConstructor(task1);
    System.out.println("Task Name="+task1.name);
    System.out.println("Task Name="+task2.name);
    }
    }