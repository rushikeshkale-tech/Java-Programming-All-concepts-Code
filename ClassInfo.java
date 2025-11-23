//import java.lang.*;

class Demo
{}

class ClassInfo
{
    /**
     * @param Arg
     */
    public static void main(String Arg[])
    {
        Demo obj = new Demo();

        final Class cref = obj.getClass();
        System.out.println("Class name of obj is : "+cref.getName());

        String str = "Marvellous";
        final Class cref1 = str.getClass();
        System.out.println("Class name of str is : "+cref1.getName());

    }
}
