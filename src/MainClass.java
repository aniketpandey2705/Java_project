import java.util.*;

public class MainClass {// main class
    public static void main(String[] args) {
        char x = 'y';// intitalizing the variables
        char quit;
        int choice, coupon;
        double totalbill = 0;
        // String total = " ";
        ArrayList<CartItem> myCart = new ArrayList<CartItem>();
        Scanner in = new Scanner(System.in);// calling scanner method
        PersonalDetails ob = new PersonalDetails();// calling classes through creating there objects
        ob.input();

        while (x == 'y') {
            Category ob1 = new Category();
            ob1.category();
            System.out.println("/////////Enter the number according to the food you want to Select?\\\\\\");
            choice = in.nextInt();
            Burger ob2 = new Burger();
            Pizaa ob3 = new Pizaa();
            Frenchfires ob4 = new Frenchfires();
            Colddrink ob5 = new Colddrink();
            Coffee ob6 = new Coffee();
            combos ob7 = new combos();
            switch (choice) {
                case 1:
                    ob2.input();
                    ob2.display();
                    // Logic: Unit Price = Total Bill / Quantity
                    if (ob2.qunatity > 0) {
                        myCart.add(new CartItem(ob2.x, ob2.amu1 / ob2.qunatity, ob2.qunatity));
                    }
                    break;

                case 2:
                    ob3.input();
                    ob3.display();
                    if (ob3.qunatity > 0) {
                        myCart.add(new CartItem(ob3.x, ob3.amu2 / ob3.qunatity, ob3.qunatity));
                    }
                    break;

                case 3:
                    ob4.input();
                    ob4.display();
                    if (ob4.qunatity > 0) {
                        myCart.add(new CartItem(ob4.x, ob4.amu3 / ob4.qunatity, ob4.qunatity));
                    }
                    break;

                case 4:
                    ob5.input();
                    if (ob5.qunatity > 0) {
                        myCart.add(new CartItem(ob5.x, ob5.bill / ob5.qunatity, ob5.qunatity));
                    }
                    break;

                case 5:
                    ob6.input();
                    ob6.display();
                    if (ob6.qunatity > 0) {
                        myCart.add(new CartItem(ob6.x, ob6.amu5 / ob6.qunatity, ob6.qunatity));
                    }
                    break;

                case 6:
                    ob7.input();
                    ob7.display();
                    if (ob7.qunatity > 0) {
                        myCart.add(new CartItem(ob7.x, ob7.amu6 / ob7.qunatity, ob7.qunatity));
                    }
                    break;

                case 7:
                    System.out.println("------- YOUR CART -------");
                    if (myCart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        // 1. Read (View Cart)
                        double currentTotal = 0;
                        for (int i = 0; i < myCart.size(); i++) {
                            CartItem item = myCart.get(i);
                            System.out.println((i + 1) + ". " + item.name +
                                    " | Qty: " + item.quantity +
                                    " | Price: " + item.totalPrice + "/-");
                            currentTotal += item.totalPrice;
                        }
                        System.out.println("Total so far: " + currentTotal + "/-");
                        System.out.println("-------------------------");

                        System.out.println("Options: 1.Remove Item  2.Update Quantity  3.Back");
                        int cartOption = in.nextInt();

                        if (cartOption == 1) {
                            // 2. Delete Feature
                            System.out.println("Enter item number to remove:");
                            int removeIndex = in.nextInt();
                            if (removeIndex > 0 && removeIndex <= myCart.size()) {
                                CartItem removed = myCart.remove(removeIndex - 1);
                                System.out.println("Removed: " + removed.name);
                            } else {
                                System.out.println("Invalid item number.");
                            }
                        } else if (cartOption == 2) {
                            // 3. Update Feature
                            System.out.println("Enter item number to update:");
                            int updateIndex = in.nextInt();
                            if (updateIndex > 0 && updateIndex <= myCart.size()) {
                                System.out.println("Enter new quantity:");
                                int newQty = in.nextInt();
                                if (newQty > 0) {
                                    // Call the update method we created in Step 1
                                    myCart.get(updateIndex - 1).updateQuantity(newQty);
                                    System.out.println("Quantity updated!");
                                } else {
                                    System.out.println("Quantity must be greater than 0.");
                                }
                            } else {
                                System.out.println("Invalid item number.");
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("Item not available. Select 7 to View/Edit Cart.");
            }
            System.out.println("If want to order more then press 'y' and if you don't want to then press 'n'");
            x = in.next().charAt(0);
        }
        System.out.println("If you want to cancel the order press 'x'or press 'y'to contiune");// asking user if he
                                                                                               // wants to cancel his
                                                                                               // order or not
        quit = in.next().charAt(0);
        System.out.println("  ");
        if (quit == 'x') {
            System.out.println("--------YOUR ORDERS HAVE BEEN CANCELLED,THANK YOU FOR USING OUR SERVICES--------");// message
                                                                                                                   // for
                                                                                                                   // cancellation
            System.exit(0);
        }
        // 1. Calculate the fresh total from the cart
        totalbill = 0;
        String finalBillList = "";

        for (CartItem item : myCart) {
            totalbill += item.totalPrice; // Uses the updated price
            finalBillList += "\n" + "Ordered: " + item.quantity + " x " + item.name + " = " + item.totalPrice + "/-";
        }
        System.out.println("If you have any coupon than enter here\t(Coupon looks like this(142444)");
        System.out.println("1.yes\n2.no");
        int choice1 = in.nextInt();
        switch (choice1) {
            case 1:
                System.out.println("Enter your code");
                coupon = in.nextInt();
                if (coupon == 112021) {
                    System.out.println("congrats you got 20% off");
                    totalbill = totalbill - ((totalbill / 100) * 20);

                } else if (coupon == 112022) {
                    System.out.println("congrats you got 5% off");
                    totalbill = totalbill - ((totalbill / 100) * 5);

                } else if (coupon == 112020) {
                    System.out.println("congrats you got 10% off");
                    totalbill = totalbill - ((totalbill / 100) * 10);

                } else if (coupon == 112023) {
                    System.out.println("congrats you got 15% off");
                    totalbill = totalbill - ((totalbill / 100) * 15);

                }
                break;
            case 2:
                System.out.println("Better luck next time!!!😊😊");
        }
        // 2. Apply your Coupon Logic
        // Example: if(coupon==112021) { totalbill = totalbill - ... }

        // 3. Display Final Output
        double billGst = totalbill + (totalbill / 100) * 5;

        System.out.println("");
        System.out.println(finalBillList); // Prints the list of items remaining in cart
        System.out.println("");
        System.out.println("~~~~~~~Your total bill:-" + billGst + " " + "With 5% GST" + "~~~~~~~");
        System.out.println(" ");
        System.out.println(":::::::THANK YOU FOR USING OUR SERVICES, YOUR ORDER IS GETTING READY:::::::::");

        if (totalbill >= 10 && totalbill <= 200) {
            System.out.println(" Congrats you have got a coupon:-'112022'");

        } else if (totalbill >= 201 && totalbill <= 450) {
            System.out.println(" Congrats you have got a coupon:-'112020'");

        } else if (totalbill >= 451 && totalbill <= 650) {
            System.out.println(" Congrats you have got a coupon:-'112023'");

        } else if (totalbill >= 651) {
            System.out.println(" Congrats you have got a coupon:-'112021'");

        }

        in.close(); // <-- Added here, at the very end of main

    }
}