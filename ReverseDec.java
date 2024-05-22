import java.util.Scanner;

public class ReverseDec{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
         
        int a, b;
        
        System.out.print("Enter the number of rows: ");
        int row = x.nextInt();

        for( a = row; a>=1; a--){
            for ( b=1; b<=a; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }



    }
}