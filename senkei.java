import java.util.Scanner;

class senkei {
public static void main(String[] args){
	/*input x1~x3*/
	double x1 = 0.0;
	double x2 = 0.0;
	double x3 = 0.0;
	/*Input a11~a33*/
	Scanner values = new Scanner(System.in);
	System.out.println("a11~a33の値をキーボードから入力しよう。");
	System.out.print("a11 : ");
	double a11 = values.nextDouble();
	System.out.print("a12 : ");
	double a12 = values.nextDouble();
	System.out.print("a13 : ");
	double a13 = values.nextDouble();
	System.out.print("a21 : ");
	double a21 = values.nextDouble();
	System.out.print("a22 : ");
	double a22 = values.nextDouble();
	System.out.print("a23 : ");
	double a23 = values.nextDouble();
	System.out.print("a31 : ");
	double a31 = values.nextDouble();
	System.out.print("a32 : ");
	double a32 = values.nextDouble();
	System.out.print("a33 : ");
	double a33 = values.nextDouble();

	System.out.print("b1 : ");
	double b1 = values.nextDouble();
	System.out.print("b2 : ");
	double b2 = values.nextDouble();
	System.out.print("b3 : ");
	double b3 = values.nextDouble();
	/*Aを行列とし、Aの絶対値を求める*/
	double determine_A = 0.0;
	determine_A = (a11*a22*a33 + a12*a23*a31 + a21*a32*a13) - (a31*a22*a13 + a21*a12*a33 + a32*a23*a11);

	if( determine_A == 0){
		System.out.println("A = 0の時は、正則ではないので、解は存在しない!.");
	}else{
		x1 = (1/determine_A)*(b1*a22*a33+a12*a23*b3+b2*a32*a13 - b3*a22*a13-b2*a12*a33-b1*a23*a32);
		x2 = (1/determine_A)*(a11*b2*a33+b1*a23*a31+a21*b3*a13 - a31*b2*a13-a21*b1*a33-b3*a23*a11);
		x3 = (1/determine_A)*(a11*a22*b3+a12*b2*a31+a21*a32*b1 - a31*a22*b1-a21*a12*b3-a32*b2*a11);

		System.out.println("----------x1,x2,x3の解------------");
		System.out.println("解: \n" +"x1 = " +x1 + "\n x2 = " +x2 +"\n x3 = " +x3);
		System.out.println("---------------------------------");
	}
}

}