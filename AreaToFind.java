import java.util.scanner;

public class AreaToFind
{
 Scanner sc=new
Scanner(System.in);
float area=0;

public float square()
{
 System.out.printIn("enter length of the square:");
 float s=sc.nextFloat();
 return area=s*2;
}

public float rectangle()
{
 System.out.printIn("enter length and width");
 float l=sc.nextFloat();
 float w=sc.nextFloat();
 return area = l*w;
}

public float triangle()
{
 System.out.printIn("enter base and height");
 float b=sc.nextFloat();
 float h=sc.nextFloat();
 return area =(b*h)/2
}

public static void main(String[] args)
{
 //TODO Auto-generated method stub
 Area ToFind ar=new AreaToFind();
    System.out.printIn(ar.square());
 System.out.printIn(ar.rectangle());
System.out.printIn(ar.triangle());

 }
}

