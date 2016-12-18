import java.util.*;
class example2
{
public static void main(String args[])
{
    int roll,x=1;
    String name,blood_group,y;
    Scanner sc=new Scanner(System.in);
    while(x==1)
    {
     System.out.println("enter the name");
     name=sc.next();
     System.out.println("enter roll");
     roll=sc.nextInt();
     System.out.println("enter blood_group");
     blood_group=sc.next();
     
     System.out.println("Name: "+name);
     System.out.println("Roll: "+roll);
     System.out.println("blood_group: "+blood_group);
     
     System.out.println("enter 1 for more entries and 0 to exit");
    
     x=sc.nextInt();

    }
}
}