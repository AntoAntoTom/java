import java.util.*;
class Exp5sum{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number :");
int num=s.nextInt();
int sum=0;
for(int i=0;i<=num;i++)
sum=sum+i;
System.out.println("Sum of first "+num+" is "+sum);
}

}
