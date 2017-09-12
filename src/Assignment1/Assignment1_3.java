package Assignment1;

import java.util.Scanner;
public class Assignment1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring all the variables 
				byte b1=0; 
				byte b2=0; 
				
			
				
				Scanner input=new Scanner(System.in); // Scanner to take input from the user.
				System.out.print("Enter First Byte variable either 0 or 1: ");
				b1=input.nextByte(); //initializing the first byte variable
				
				boolean booleanb1;                                        // Declaring a boolean(Variable) named firstBinaryNumber.
				if ((b1 > 0)) booleanb1 = true;                        // if and else loop ..to check convert integer binaryNum2 to boolean secondBinaryNumber.
				else {
					booleanb1 = false;
				} 
				
				
				System.out.print("Enter Second Byte variable either 0 or 1: ");
				b2=input.nextByte(); //initializing the second byte variable
				
				
				boolean booleanb2;                                        // Declaring a boolean(Variable) named firstBinaryNumber.
				if ((b2 > 0)) booleanb2 = true;                        // if and else loop ..to check convert integer binaryNum2 to boolean secondBinaryNumber.
				else {
					booleanb2 = false;
				} 

				
				System.out.println("P       Q      P&Q      P&&Q     ");
				
				System.out.println(b1 + "\t" +b2 + "\t "   +(b1&b2)+"\t  " + (booleanb1&&booleanb2));
				input.close();
			}

		}
