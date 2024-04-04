import java.util.*;
class Exp3Fact{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number :");
int num=s.nextInt();
int sum=1;
for(int i=1;i<=num;i++){
sum=sum*i;
}
System.out.println("Factorial of "+num+" is :"+sum);
}
}
