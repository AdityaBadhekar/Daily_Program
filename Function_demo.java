package minmax;
import java.util.Scanner;
public class Function_demo 
{
    static int i, j, cal = 0, size;
    static int num[];
    	public static void main(String args[]) 
    	{
          accept();
    	  display();
    	  greatestNo();
    	  smallestNo();
    	  ascendingno();
    	  descendingno();
    	}
        static void accept() {//
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers you want:");
        size = sc.nextInt();
        num = new int[size]; // Initialize the array with the correct size
        System.out.println("enter your numbers: ");
        for (i = 0; i < size; i++) 
        {
            num[i] = sc.nextInt();
        }
        }
    	public static void display() {
        for (i = 0; i < size; i++) {
            System.out.println("numbers are" + num[i]);
        }
    }
        public static void greatestNo() {
        cal = num[0];
        for (i = 0; i < size; i++) {
            if (num[i] > cal) {
                cal = num[i];
            }
        }
        System.out.println("greatest Number is" + cal);
    }
        public static void smallestNo() {
        cal = num[0];
        for (i = 0; i < size; i++) {
            if (num[i] < cal) {
                cal = num[i];
            }
        }
        System.out.println("smallest number is " + cal);
    }
        public static void ascendingno() {
        int temp;
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("numbers in ascending order ");
        for (i = 0; i < size; i++)
            System.out.print("\t" + num[i]);
        System.out.println();
    }
        public static void descendingno() {
        int temp;
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("numbers in descending order ");
        for (i = 0; i < size; i++)
            System.out.print("\t" + num[i]);
        System.out.println();
    }
 
    }