import java.util.ArrayList;
import java.util.Scanner;

/**
 * Task117
 */
public class Task117 {

    public static void main(String[] args) {
        
        int greatestNumber = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner reader1 = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        numbers.add(reader1.nextInt());
        
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter Your Second Number: ");
        numbers.add(reader2.nextInt());

        Scanner reader3 = new Scanner(System.in);
        System.out.println("Enter Your Third Number: ");
        numbers.add(reader3.nextInt());
        
        

        for(int i=0; i<numbers.size(); i++){
            if(i == 2){
                break;
            }
            else if (numbers.get(i)<numbers.get(i+1)) {
                greatestNumber = numbers.get(i+1);
            }
        }

        System.out.println("The Greatest Number is" + " " +greatestNumber);
    }
}
