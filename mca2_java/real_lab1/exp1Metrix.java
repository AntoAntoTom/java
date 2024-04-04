import java.util.Scanner;


class exp1Metrix
{
public static void main(String args[]){
int row,col,row1,col1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the rows of first matrix :");
row=s.nextInt();
System.out.print("Enter the col of first matrix :");
col=s.nextInt();
operation m1=new  operation(row,col);
System.out.println("Enter the elements of first matrix :");
m1.insert();
System.out.print("Enter the rows of second matrix :");
row=s.nextInt();
System.out.print("Enter the col of second matrix :");
col=s.nextInt();
operation m2=new  operation(row,col);
System.out.println("Enter the elements of second matrix :");
m2.insert();

System.out.println("metrix 1 :");
m1.display();
System.out.println("metrix 2 :");
m2.display();
System.out.println("Addition :");
m1.add(m2);
System.out.println("Product :");
m1.mult(m2);
}
}

class operation
{
int row,col;
int mtrx[][];
operation(){
}
operation(int r,int c){
row=r;
col=c;
mtrx=new int[r][c];
}
void insert(){
Scanner s=new Scanner(System.in);
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
mtrx[i][j]=s.nextInt();
	}
	}
}
void add (operation m){
	if(this.row==m.row && this.col==m.col){
		 operation add=new  operation(row,col);
		for(int i=0;i<this.row;i++){
			for(int j=0;j<m.col;j++){
				add.mtrx[i][j]=this.mtrx[i][j]+m.mtrx[i][j];
			}
		}
	add.display();
	}
	else{
	System.out.println("invalid metrix");
	}
}
void mult(operation m){
	if(this.col==m.row){
		int sum;
		 operation cros=new  operation(this.row,m.col);
		for(int i=0;i<this.row;i++){
			sum=0;
			for(int j=0;j<m.col;j++){
			for(int k=0;k<this.col;k++){
				sum+=this.mtrx[i][k]+m.mtrx[k][j];
				cros.mtrx[i][j]=sum;
			}
			}
		}
	cros.display();
	}
	else{
	System.out.println("invalid metrix");
	}
}
void display(){
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			System.out.print(mtrx[i][j]+" ");
		}
		System.out.println("");
	}
}
}

