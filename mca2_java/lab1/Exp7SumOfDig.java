import java.util.*;
class Exp7SumOfDig{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter a num :");
int num=s.nextInt();
System.out.print("Sum of digits of "+num+" is ");
int i=0;
int sum=0;
while(num!=0){
i=num%10;
num=num/10;
sum+=i;
}
System.out.println(sum);

}



}
