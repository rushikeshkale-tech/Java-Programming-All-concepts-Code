import java.io.*;

class Wrapper
{
    /**
     * @param a
     * @throws IOException
     */
    public static void main(String a[]) throws IOException
    {
       int no = 11;

       final Integer iobj = new Integer(11);

       int i = iobj;            // Unboxing

       Integer iobj2 = no;       // Boxing

       System.out.println(no);
       System.out.println(iobj);
       System.out.println(i);
       System.out.println(iobj2);
    }
}