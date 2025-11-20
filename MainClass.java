import java.util.*;
public class MainClass {//main class
   public static void main(String[] args){
        char x = 'y' ;//intitalizing the variables
        char quit;
        int choice,coupon;
        double totalbill=0;
        String total=" ";
       
        Scanner in = new Scanner(System.in);//calling scanner method
        PersonalDetails ob = new PersonalDetails();//calling classes through creating there objects
        ob.input();
        
        while(x=='y'){
            Category ob1 = new Category();
            ob1.category();
            System.out.println("/////////Enter the number according to the food you want to Select?\\\\\\");    
            choice = in.nextInt();
            Burger ob2  = new Burger();
            Pizaa ob3= new Pizaa();
            Frenchfires ob4 = new Frenchfires();
            Colddrink ob5 = new Colddrink();       
            Coffee ob6 = new Coffee();
            combos ob7= new combos();
            switch(choice){
            
                case 1:  
                    ob2.input();
                    ob2.display();
                    totalbill+=ob2.amu1;
                    total+="\n"+ob2.total1;
        
                break;
                case 2:
                    ob3.input();
                    ob3.display();
                    totalbill+=ob3.amu2;
                    total+="\n"+ob3.total2;
                break;
                case 3:
                    ob4.input();
                    ob4.display();
                    totalbill+=ob4.amu3;
                    total+="\n"+ob4.total3;
                break; 
                case 4:
                    ob5.input();
                    totalbill+=ob5.amu4;
                    total+="\n"+ob5.total4;
                break;
                case 5:
                    ob6.input();
                    ob6.display();
                    totalbill+=ob6.amu5;
                    total+="\n"+ob6.total5;
                break;
                case 6:
                    ob7.input();
                    ob7.display();
                    totalbill+=ob7.amu6;
                    total+="\n"+ob7.total6;
                break;
                default:
                    System.out.println("The item is not available");
                    
            }
            System.out.println("If want to order more then press 'y' and if you don't want to then press 'n'");//asking user if he wants to order more or not
            x = in.next().charAt(0);      
        }
        System.out.println("If you want to cancel the order press 'x'or press 'y'to contiune");// asking user if he wants to cancel his order or not
        quit =in.next().charAt(0);
        System.out.println("  ");
        if(quit=='x'){
             System.out.println("--------YOUR ORDERS HAVE BEEN CANCELLED,THANK YOU FOR USING OUR SERVICES--------");//message for cancellation
             System.exit(0);
        }
        System.out.println("If you have any coupon than enter here\t(Coupon looks like this(142444)");
        System.out.println("1.yes\n2.no");
        int choice1=in.nextInt();
        switch(choice1){
            case 1:
                System.out.println("Enter your code");
                coupon=in.nextInt();
                if(coupon==112021){
                    System.out.println("congrats you got 20% off");
                    totalbill=totalbill-((totalbill/100)*20);
                    
                }
                else if(coupon==112022){
                    System.out.println("congrats you got 5% off");
                    totalbill=totalbill-((totalbill/100)*5);
                    
                }
                else if(coupon==112020){
                    System.out.println("congrats you got 10% off");
                    totalbill=totalbill-((totalbill/100)*10);
                    
                }
                else if(coupon==112023){
                    System.out.println("congrats you got 15% off");
                    totalbill=totalbill-((totalbill/100)*15);
                    
                }
            break;
            case 2:
                System.out.println("Better luck next time!!!😊😊");
            }   

        double billGst=totalbill+(totalbill/100)*5;
        System.out.println(total);
        System.out.println(" ");
        System.out.println("~~~~~~~Your total bill:-"+billGst+" "+"With 5% GST"+"~~~~~~~");//displaying total bill 
        System.out.println(" ");
        System.out.println(":::::::THANK YOU FOR USING OUR SERVICES, YOUR ORDER IS GETTING READY:::::::::");//mesaage for confirmation
        if(totalbill>=10&&totalbill<=200){
            System.out.println(" Congrats you have got a coupon:-'112022'");
            
        }
        else if(totalbill>=201&&totalbill<=450){
            System.out.println(" Congrats you have got a coupon:-'112020'");
            
        }
        else if(totalbill>=451&&totalbill<=650){
            System.out.println(" Congrats you have got a coupon:-'112023'");
            
        }
        else if(totalbill>=651) {
            System.out.println(" Congrats you have got a coupon:-'112021'");
            
        }

        in.close(); // <-- Added here, at the very end of main

}
}