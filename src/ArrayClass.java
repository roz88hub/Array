// Creating a array type of String, int, boolean, double, char
import java.util.*;
public class ArrayClass {
	
	public static void main(String[] args){
	
	int[] intArray = {2,4,6,8,1,3,5,7,9};
	double[] dblArray = new double[9];
	boolean[] bolArray = {true, false, false, true, false, true, true};
	char[] charArray = new char[8];
	String[] strArray ={"Rojan","Roman","Rodan","Rohan","Ronan","Roban","Rozan",};

	for(String varStrng: strArray ){
		System.out.println(varStrng);
	}
	int x;       
	for(x= 0; (x < intArray.length) ; x+=2){
		/*if(x % 2 ==0)*/
			System.out.println(intArray[x]);
	}
	int y;
	for(y= 0; (y < dblArray.length) ; y++){
		System.out.println(dblArray[y]);
	}
	int z;
	String xyz = "Hello";
	
	for(z= 0; (z < charArray.length) ; y++){
		charArray[z]= xyz.charAt(0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which char Index you want to print");
		try{
		int UserInput = scanner.nextInt();
		}
		catch(Exception e){
			System.out.println("char index out of bound");
		}
		System.out.println(charArray[y]);
	}
	
	}
	
}
