import java.util.Scanner; //importing the scanner pacakage to implement in the program.

public class dataType1 { //Use of Scanner function in Java
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int x= scn.nextInt();
            System.out.println(x);
        }
    }
    
}
