import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner NewNumber = new Scanner(System.in);
        LinkedList<Integer> Number = new LinkedList<>();
        int x, bl=0;
                  while(bl==0)
                        {
                             System.out.print("Enter Number  :");
                             x=NewNumber.nextInt();
                            boolean status = Number.contains(x);
                            if(status)
                                {
                                 System.out.println("Same Numbers");
                                 bl=1;
                                }
                            else
                                {
                                Number.add(x);
                                System.out.println("Added "+x);
                                System.out.println("List after update " +Number);
                                }
                        }


    }
}