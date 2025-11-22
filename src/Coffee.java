 import java.util.*;
public class  Coffee extends MainClass{//extending mainclass
    double amu5;
    Scanner in = new Scanner(System.in);//calling scanner method
    String x,total5;
    int qunatity;
        void input(){
            System.out.println("YOU HAVE SELECTED  COFFEE");
            System.out.println("");
            System.out.println("Do you want Cold or Hot");//asking user what type of coffee he/she wants
            String a = in.nextLine();
            System.out.println("What size do you want, Full or Half ?");
            String b = in.nextLine();
            System.out.println("How many coffee do you want");
            qunatity=in.nextInt();
            if(a.equals("hot")){
                amu5 = 39+5;//adding extra amount
                x="Hot Coffee";
            }
            else 
            {   
                amu5=39;  
                x="Cold Coffee";
            }
            if (b.equals("full")){
                amu5= 39+15;
                x="Full"+" "+x;
            }
             
            else{
                amu5=39;
                x="Half"+" "+x;
            }
            amu5=amu5*qunatity;
    }
    void display(){
        total5=" YOU HAVE ORDERED A "+" "+qunatity+" "+ x + " " + " = " + amu5 + "/-";
        System.out.println("");
        System.out.println(total5);//displaying the biil and food as per the order
        System.out.println("");
    }
}