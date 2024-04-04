import java.util.*;
class Exp6Pattern{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter the number of steps :");
int step=s.nextInt();

System.out.println("");
System.out.println("");
for(int i=0;i<step;i++){
for(int j=0;j<=i;j++){
System.out.print("* ");
}

System.out.println("");
}
}


}
