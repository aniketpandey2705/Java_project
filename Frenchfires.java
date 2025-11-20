 import java.util.*;
public class Frenchfires extends MainClass{//extending mainclass
    double amu3;
    Scanner in = new Scanner(System.in);//calling scanner method
    String x,total3;
    int qunatity;
        void input(){
            System.out.println("***************YOU HAVE SELECTED FRENCH FIRES***************");
            System.out.println("");
            System.out.println("Do you want plain or spicy"+"\t (spicy cost extra 5/-)");//asking what type of french fires user wants
            String a = in.nextLine();
            System.out.println("What size do you want(small,medium,large) ?"+"\t (small cost=59| medium cost=64| larger cost=79)");
            String b = in.nextLine();
            System.out.println("How many do you want");
            qunatity=in.nextInt();
            if(a.equals("spicy")){
                amu3 = 59+5;//addding extra cost
                x="Spicy Frenchfires";
            }
            else 
            {   
                amu3=59;  
                x="Frenchfires";
            }
            if (b.equals("large")){
                amu3= 59+15;
                x="Large"+" "+x;
            }
            else if(b.equals("medium")){
                amu3=59+10;
                x="Medium"+" "+x;
            }
            else{
                amu3=59;
                x="Small"+" "+x;
            }
            amu3=amu3*qunatity;
    }
    void display(){
        total3="~~~~~~~YOU HAVE ORDERED A "+" "+qunatity+" "+ x + " " + " = " + amu3 + "/-~~~~~~~";
        System.out.println("");
        System.out.println(total3); //displaying the bill and food as per the order.
        System.out.println("");
    }
}