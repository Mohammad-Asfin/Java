public class LaunchClassForNameEx 
{

    public static void main(String[] args) throws ClassNotFoundException
    {
        Demo d=new Demo();
    }
}

class Demo
{
    static
    {
        System.out.println("Static Block");
    }
    
    {
        System.out.println("Instance block ==> Non static");
    }
}
