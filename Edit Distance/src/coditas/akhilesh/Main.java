package coditas.akhilesh;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first string: ");
        String s1 = scan.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = scan.nextLine();
        int lenS1 = s1.length();
        int lenS2 = s2.length();
        System.out.println("The minimum number of operations required are: "+distance(s1,s2,lenS1,lenS2));
    }
/*
Recursive function
 */
    public static int distance(String s1,String s2,int lenS1, int lenS2){
        /*
        If anyone of the string is empty then the other string length is equal to character insertion
         */
        if(lenS1==0){
            return lenS2;
        }
        if(lenS2==0){
            return lenS1;
        }

        if(s1.charAt(lenS1-1)==s2.charAt(lenS2-1)) {
            return distance(s1, s2, lenS1-1, lenS2-1);
        }
        else{
            return 1 + (least(distance(s1, s2, lenS1, lenS2 - 1), //For insert operation
                    distance(s1, s2, lenS1 - 1, lenS2), //For remove operation
                    distance(s1, s2, lenS1 - 1, lenS2 - 1))); //For replace operation
        }
    }
    /*
    Function to return the method with least operations
     */
    public static int least(int insert,int remove,int replace){
        if (insert <= remove && insert <= replace) {
            return insert;
        }
        if (remove <= insert && remove <= replace) {
            return remove;
        }
        else {
            return replace;
        }
    }
}
