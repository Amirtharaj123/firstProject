import java.util.*;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s=m.nextLine();
        System.out.print("The trim to remove first and last space:"+s.trim());
    }
}