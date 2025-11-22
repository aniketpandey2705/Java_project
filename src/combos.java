 import java.util.*;
public class combos extends MainClass{//extending the mainclass
    double amu6, bill;
    String x,total6;
    int qunatity,choice;
    char more='y';
    
    Scanner in = new Scanner(System.in);//calling scanner method
     
    void input(){
        System.out.println("***************YOU HAVE SELECTED COMBOS***************");
        System.out.println("                         "); 
        while(more=='y'){
             System.out.println("Please select the number according to your Combos from the below");
                System.out.println("1.Veg Burger(1)+Spicy French fires(small)+coca cola(1):-149/-"); //displaying various types of cold drink
                System.out.println("2.Non Veg Burger(1)+Plain French Fires(medium)+coca cola(1):-199/-");
                System.out.println("3.Veg Pizza(1)+Thumbs up(1):-210/-");
                System.out.println("4.Non Veg Pizza(1)+Coca cola(1):-249/-");
                System.out.println("5.KING's MEAL:- Special Veg Burger(1)+Special Non Veg(1);+Spicy French Fires(large)+Coca cola(1):-449/-!!!");
                System.out.println("");
                choice=in.nextInt();
                
             switch(choice){
                    case 1:
                        x="Veg Burger(1)+Spicy French fires(small)+coca cola(1)";
                        System.out.println("How many do you want?");
                        qunatity=in.nextInt();
                        bill=149*qunatity;
                        total6+="\n"+"~~~~~~~YOU HAVE ORDERED A"+" "+qunatity+" "+ x + " " + " = " + bill + "/-~~~~~~~";//displaying the biil and food as per the order
                        
                    break;
                    case 2:
                        x="Non Veg Burger(1)+Plain French Fires(medium)+coca cola(1)";
                        System.out.println("How many do you want?");
                        qunatity=in.nextInt();
                        bill=199*qunatity;
                        total6+="\n"+"~~~~~~~YOU HAVE ORDERED A"+" "+qunatity+" "+ x + " " + " = " + bill + "/-~~~~~~~";
                                             
                    break;
                    case 3:
                        x="Veg Pizza(1)+Thumbs up(1)";
                        System.out.println("How many do you want?");
                        qunatity=in.nextInt();
                        bill=210*qunatity;
                         total6+="\n"+"~~~~~~~YOU HAVE ORDERED A"+" "+qunatity+" "+ x + " " + " = " + bill + "/-~~~~~~~";
                                         
                    break;
                    case 4:
                        x="Non Veg Pizza(1)+Coca cola(1)";
                        System.out.println("How many do you want?");
                        qunatity=in.nextInt();
                        bill=249*qunatity;
                        total6+="\n"+"~~~~~~~YOU HAVE ORDERED A"+" "+qunatity+" "+ x + " " + " = " + bill + "/-~~~~~~~";                          
                    break;
                    case 5:
                        x="KING's MEAL:- Special Veg Burger(1)+Special Non Veg(1);+Spicy French Fires(large)+Coca cola(1)";
                        System.out.println("How many do you want?");
                        qunatity=in.nextInt();
                        bill=449*qunatity;
                        total6+="\n"+"~~~~~~~YOU HAVE ORDERED A"+" "+qunatity+" "+ x + " " + " = " + bill + "/-~~~~~~~";                        
                    break;
                }
            amu6+=bill;
            System.out.println(total6);
            System.out.println("Want to order some more Combos? (press 'y'to order and press 'x' if you don't want to 😊");//asking user if he want to order more cold drinks or not
            more=in.next().charAt(0);
        }
    }
        
     
    void display(){
        total6="~~~~~~~YOU HAVE ORDERED A "+" "+qunatity+" "+ x + " " + " = " + amu6 + "/-~~~~~~~";
        System.out.println("");
        System.out.println(total6);//displaying the food with bill
        System.out.println("");
    }
}