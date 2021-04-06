package project4;


public class project4 {

   
    public static void main(String[] args) {
        SinglyCircularList CLL1 = new SinglyCircularList();
        
        
        CLL1.insert(2);
        CLL1.insert(4);
        CLL1.insert(6);
        CLL1.insert(8);
        CLL1.insert(10);
        CLL1.insert(12);
        CLL1.insert(14);
        CLL1.printList();
        SinglyCircularList CLL2 = new SinglyCircularList();
        CLL2.insert(2);
        CLL2.insert(4);
        CLL2.insert(6);
        CLL2.insert(8);
        CLL2.insert(10);
        CLL2.insert(12);
        CLL2.insert(14);
        CLL2.printList();
       
        for (int i = 0; i <= CLL1.getSize();){
           
            
        
            for(int j = 0;j<=CLL2.getSize();j++){
            
                if( (CLL1.getTemp().num == CLL2.getTemp().num) ){
                    i++;
                    break;
                }
                
            CLL2.getTemp().next= CLL2.getTemp();
            }
            CLL1.getTemp().next= CLL1.getTemp();
        }   
        System.out.println("CLL1 and CLL2 are the same");
    }
}
