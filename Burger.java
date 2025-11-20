import java.util.*;
public class Burger extends MainClass{//extending the mainclass
    double amu1=99;
    String x,total1;
    int qunatity;
    
    Scanner in = new Scanner(System.in);//calling scanner method
    void input(){
        System.out.println("***************YOU HAVE SELECTED BURGER***************");
        System.out.println("                         "); 
        System.out.println("Do you want Veg or Non veg" + "\t (Non veg cost extra 30/-)");//asking for what type of burger user wants
        String a = in.nextLine();
        System.out.println("Do you want extra cheese ?"+"\t (Extra cheese cost extra 20/-)");
        String b = in.nextLine();
        System.out.println("How many burgers do you want");
        qunatity=in.nextInt();
        if(a.equals("Non veg")){
            amu1 =amu1+30 ;//adding extra amount
            x= "Non Veg Burger";
        }
        else 
        {   
            amu1=amu1; 
            x= "Veg burger";
        }
        if (b.equals("yes")){
            amu1= amu1+20 ;
            x= x +" "+"with extra cheese";
        }
        else{
            amu1=amu1;
            x=x;
        }
        amu1=amu1*qunatity;
     }
    void display(){
        total1="~~~~~~~YOU HAVE ORDERED A "+" "+qunatity+" "+ x + " " + " = " + amu1 + "/-~~~~~~~";
        System.out.println("");
        System.out.println(total1);//displaying the food with bill
        System.out.println("");
    }
}