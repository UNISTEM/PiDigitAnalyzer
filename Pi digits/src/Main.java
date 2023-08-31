import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
            throws FileNotFoundException {   //throw

        Scanner pi100 = new Scanner(new File("Pi100"));

        int[] numCount = new int[10]; //create array to store count, base 10 number therefore length is 10

        //counting digit repeats in pi
        while (pi100.hasNext()) {
            String pi = pi100.next(); //import as string for string slicing
            //System.out.println(pi);
            for (int i = 0; i < pi.length(); i++) {
                if (pi.charAt(i) == '9') {
                    numCount[9]++;
                } else if (pi.charAt(i) == '8') {
                    numCount[8]++;
                } else if (pi.charAt(i) == '7') {
                    numCount[7]++;
                } else if (pi.charAt(i) == '6') {
                    numCount[6]++;
                } else if (pi.charAt(i) == '5') {
                    numCount[5]++;
                } else if (pi.charAt(i) == '4') {
                    numCount[4]++;
                } else if (pi.charAt(i) == '3') {
                    numCount[3]++;
                } else if (pi.charAt(i) == '2') {
                    numCount[2]++;
                } else if (pi.charAt(i) == '1') {
                    numCount[1]++;
                } else if (pi.charAt(i) == '0') {
                    numCount[0]++;
                } //no need to count the dot
            }
        }
        //test if the number counts are correct
        for (int p = 0; p < 10; p++) {
            System.out.println("number of "+p+"s: "+numCount[p]);
        }

        for (int i = 0; i < 100; i++){
            System.out.print("-");
        }
        System.out.println(" ");

        //printing histogram
        for (int j = 0; j < numCount.length; j++) {
            System.out.print("number of " + j + "s: ");
            for (int n = 1; n <= numCount[j] / 15; n++)  { //count starts from 1
                if (numCount[j] == 0) {
                    System.out.print("");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}

