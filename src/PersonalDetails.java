import java.util.*;
public class PersonalDetails{
      String name,email,password;//initializing the variables
      long num;
      void input(){
        Scanner in = new Scanner(System.in);//calling scanner method
        System.out.println("********************WELCOME TO YUMMYBEE😋😋*********************");
        System.out.println(" ");
        System.out.println("Enter your email Address:-");
        email= in.nextLine();
        System.out.println("Enter your password");
        password= in.nextLine();
    
       if(email.equals("A")&&password.equals("A")){
        System.out.println("                                ");
        System.out.println("*********************LOGIN SUCESSFULLY*********************");
        System.out.println("Enter your name");
        name=in.nextLine();
        System.out.println("Enter your phone number:-");
        num = in.nextLong();//this message shown after filling up the details
        System.out.println("NOW YOU CAN PROCEED FOR YOUR ORDER!!!😊😊");
        System.out.println("                                  ");
      }
      else{
          System.out.println("####Invalid email or password tryagain!!!😯😯####");
          System.exit(0);
        }
    

}
}