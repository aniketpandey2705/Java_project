  import java.util.*;
public class Colddrink extends MainClass{//extending mainclass
    double amu4,bill;
    Scanner in = new Scanner(System.in);//calling scanner method
    String x;
    String total4=" ";
    int qunatity;
    int choice;
    char more= 'y';
         
        void input(){
            System.out.println("YOU HAVE SELECTED COLD DRINK");
            System.out.println("");
            while(more=='y'){
            System.out.println("Please select the number according to your cold drink from the below");
            System.out.println("1.Maaza :- 30/-"); //displaying various types of cold drink
            System.out.println("2.Sprite :- 30/-");
            System.out.println("3.Coca Cola :- 30/-");
            System.out.println("4.Fanta :- 30/-");
            System.out.println("5.Thumbs up :- 30/-");
            System.out.println("");
            choice=in.nextInt();
            switch(choice){
                case 1:
                    x="Maza";
                    System.out.println("How many do you want?");
                    qunatity=in.nextInt();
                    bill=30*qunatity;
                    total4+="\n"+"~~~~~~~YOU HAVE ORDERED A"+" "+qunatity+" "+ x + " " + " = " + bill + "/-~~~~~~~";//displaying the biil and food as per the order
                    
                break;
                case 2:
                    x="Spirit";
                    System.out.println("How many do you want?");
                    qunatity=in.nextInt();
                    bill=30*qunatity;
                    total4+="\n"+"~~~~~~~YOU HAVE ORDERED A"+" "+qunatity+" "+ x + " " + " = " + bill + "/-~~~~~~~";
                                         
                break;
                case 3:
                    x="Coca cola";
                    System.out.println("How many do you want?");
                    qunatity=in.nextInt();
                    bill=30*qunatity;
                     total4+="\n"+"~~~~~~~YOU HAVE ORDERED A"+" "+qunatity+" "+ x + " " + " = " + bill + "/-~~~~~~~";
                                     
                break;
                case 4:
                    x="Fanta";
                    System.out.println("How many do you want?");
                    qunatity=in.nextInt();
                    bill=30*qunatity;
                    total4+="\n"+"~~~~~~~YOU HAVE ORDERED A"+" "+qunatity+" "+ x + " " + " = " + bill + "/-~~~~~~~";                          
                break;
                case 5:
                    x="Thumbs up";
                    System.out.println("How many do you want?");
                    qunatity=in.nextInt();
                    bill=30*qunatity;
                    total4+="\n"+"~~~~~~~YOU HAVE ORDERED A"+" "+qunatity+" "+ x + " " + " = " + bill + "/-~~~~~~~";                        
                break;
            }
            amu4+=bill;
            System.out.println(total4);
            System.out.println("Want to order some more Cold drink? (press 'y'to order and press 'x' if you don't want to 😊");//asking user if he want to order more cold drinks or not
            more=in.next().charAt(0);
             
        }
    }
}