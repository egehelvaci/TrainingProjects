import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner NewNumber = new Scanner(System.in);
        LinkedList<Integer> L1 = new LinkedList<Integer>();
        LinkedList<Integer> L2 = new LinkedList<Integer>();
        LinkedList<Integer> L3 = new LinkedList<Integer>();
        int i, j;


        L1.add(5);
        L1.add(8);
        L1.add(18);
        L1.add(22);
        L1.add(39);

        L2.add(12);
        L2.add(18);
        L2.add(39);
        L2.add(81);
        L2.add(99);

        System.out.println("List 1 :" + L1);
        System.out.println("List 2 :" + L2);

        for (i = 0; i <= L1.size()-1; i++) {


            for (j = 0; j <= L2.size()-1; j++) {

                    if (L1.get(i)<L2.get(j) )
                    {
                        L3.add(L1.get(i));
                        break ;
                    }
                boolean status = L3.contains(L2.get(j));
                   if(L2.get(j)<L1.get(i) && !status)
                {

                    L3.add(L2.get(j));

                   }

            }


        }
        boolean status = L3.contains(L2.get(L2.size()-1));
        if (status)
            L3.add(L1.get(L1.size()-1));
            else
            L3.add(L2.get(L2.size()-1));

             System.out.println("List 3 : " + L3);
    }
}