import java.util.*;
class Exp8string{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter a string :");
String str=s.next();
System.out.print("Enter a chractor :");
char ch=s.next().charAt(0);
int count=0;
for(int i=0;i<str.length();i++){
if(str.charAt(i)==ch)
++count;

}
System.out.println("The count of number of a present in string "+str+" is "+count);

}
}
