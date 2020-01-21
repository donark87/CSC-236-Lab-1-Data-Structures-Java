//Donark Patel
//csc 236
//Lab 1B
//Date: 9/10/2018
//This application convert Hex number to Decimal.
import java.util.Scanner;

public class Lab1B {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a hex string ");
        String hexNumber = kb.next();
        System.out.println("The decimal equivalent of "
                + hexNumber + " is " + hex2Dec(hexNumber));
    }
    public static int hex2Dec(String hexNumber) {
        int indexNumber = 0;
        int result = 0;
        int a = hexNumber.length()-1;
        return hex2Dec(hexNumber, indexNumber, a, result);
    }
    public static int hex2Dec(String hexNumber, int indexNumber, int a, int result) {
        int decNumber = 0;
        if (hexNumber.charAt(indexNumber)>='A'&& hexNumber.charAt(indexNumber) <= 'F' || hexNumber.charAt(indexNumber)>='a'&& hexNumber.charAt(indexNumber) <= 'f' )
        {
            decNumber = (hexNumber.charAt(indexNumber) - 'A') + 10;
        }
        else {
            decNumber = Integer.parseInt(String.valueOf(hexNumber.charAt(indexNumber)));
        }
        decNumber *= (int)Math.pow(16, a);

        if (a == 0)
            return result + decNumber;
        else
            return hex2Dec(hexNumber, indexNumber + 1, a - 1, decNumber + result);
    }
}
