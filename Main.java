import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int powerCount = 0;
        System.out.print("Enter a hexadecimal number: ");
        String hex = scan.nextLine();
        if(hex.substring(0, 2).equals("0x")){
            hex = hex.substring(2, hex.length());
        }
        hex = hex.toUpperCase();
        long decCurrent = 0;
        while (powerCount < hex.length()){
            char hexCurrent =  hex.charAt(hex.length() - 1 - powerCount);
            switch (hexCurrent){
                case 'A':
                    decCurrent += (10 * Math.pow(16,powerCount));
                    break;
                case 'B':
                    decCurrent += (11 * Math.pow(16,powerCount));
                    break;
                case 'C':
                    decCurrent += (12 * Math.pow(16,powerCount));
                    break;
                case 'D':
                    decCurrent += (13 * Math.pow(16,powerCount));
                    break;
                case 'E':
                    decCurrent += (14 * Math.pow(16,powerCount));
                    break;
                case 'F':
                    decCurrent += (15 * Math.pow(16,powerCount));
                    break;
                default:
                    decCurrent += (Character.getNumericValue(hexCurrent) * Math.pow(16,powerCount));
                    //We found the method used here at <stackoverflow.com/questions/19388037/converting-characters-to-integers-in-java>
                    break;
            }
            powerCount++;
        }
    System.out.println("Your number is " + decCurrent + " in decimal");
    }
}
