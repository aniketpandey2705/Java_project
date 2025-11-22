import java.util.*;
public class Pizaa extends MainClass{//extending main class
    double amu2;
    Scanner in = new Scanner(System.in);//calling scanner method
    String x,total2;
    int qunatity;
        void input(){
            System.out.println("***************YOU HAVE SELECTED PIZAA***************");
            System.out.println("                         "); 
            System.out.println("Do you want Veg or Non veg" + "\t (Non veg cost extra 30/-)");//asking for what type of pizaa user wants
            String a = in.nextLine();
            System.out.println("Do you want extra cheese ?"+"\t (Extra cheese cost extra 20/-)");
            String b = in.nextLine();
            System.out.println("Do you want extra toppings ?"+"\t (Extra toppings cost extra 20/-)");
            String c = in.nextLine();
            System.out.println("How many Pizaa do you want");
            qunatity=in.nextInt();
            if(a.equals("Non veg")){
                amu2 = 199+30;//adding extra costs
                x="Non Veg Pizaa";
            }
            else 
            {   
                amu2=199 ;  
                x="Veg Pizaa";
            }
            if (b.equals("yes")){
                amu2= amu2+20;
                x= x+" "+"with extra cheese";
            }
            else{
                amu2=199;
                x=x;
            }
            if (c.equals("yes")){
                amu2= amu2+20;
                x= x+", "+"extra toppings";
            }
            else{
                amu2=199;
                x=x;
            }
            amu2=amu2*qunatity;
    }
    void display(){
        total2="~~~~~~~YOU HAVE ORDERED A "+" "+qunatity+" "+ x + " " + " = " + amu2 + "/-~~~~~~~";
        System.out.println(" ");
        System.out.println(total2);//displaying bill and food name as per the food ordered
        System.out.println(" ");
    }
            
    }
