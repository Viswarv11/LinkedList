import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedList myLL=new LinkedList();
//        String input=scanner.nextLine();
        String input="1 2 3 4 5";
        String[] inputarray=input.split(" ");
        System.out.println(Arrays.toString(inputarray));
        for (int i = 0; i < inputarray.length; i++) {
            myLL.append(Integer.parseInt(inputarray[i]));
        }
        System.out.println("Linked List : ");
        myLL.print();
        System.out.println(myLL.getHead().value);
        System.out.println("Reverse Linked List : ");
        myLL.reverse();
        myLL.print();
        System.out.println(myLL.getHead().value);
    }
}
