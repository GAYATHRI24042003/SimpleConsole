import java.util.Scanner;

public class foodorder{
    // price for food
    int salad=100;
    int pastery=120;
    int pizza=150;
    int coldcoffee=100;
    int choice;
    int qty;
    static int total;
    String again;
Scanner sc=new Scanner (System.in);


    //  mtd for displaying food menu
public void DisplayMenu()
{
    System.out.println("************* Welcome To our Cafe *************");
    System.out.println("===============================================");
    System.out.println("                    1.SALAD               100/-");
    System.out.println("                    2.PASTERY             120/-");
    System.out.println("                    3.PIZZA               150/-");
    System.out.println("                    4.COLDCOFFEE          100/-");
    System.out.println("                    5.EXIT                100/-");
    System.out.println("===============================================");
}

public void generatebill()
{
    System.out.println("********************* Thankyou for Ordering *******************");
    System.out.println("********************* Your Bill is : "+total+" *********************");
}



// mtd to create food order
public void order()
{
    while(true){
     System.out.println("Enter your Choice : ");
     choice=sc.nextInt();
    switch (choice)
    {
        case 1:
            System.out.println("You have Selected Salad");
            System.out.println("Enter the quantity required : ");
            qty=sc.nextInt();
            total=total+qty*salad;
            break;
        case 2:
            System.out.println("You have Selected Pastery");
            System.out.println("Enter the quantity required : ");
            qty=sc.nextInt();
            total=total+qty*pastery;
            break;
        case 3 :
            System.out.println("You have Selected Pastery");
            System.out.println("Enter the quantity required : ");
            qty=sc.nextInt();
            total=total+qty*pastery;
            break;
         case 4 :
            System.out.println("You have Selected ColdCoffee");
            System.out.println("Enter the quantity required : ");
            qty=sc.nextInt();
            total=total+qty*coldcoffee;
            break;
        case 5:
            System.exit(1);
            break;
        default:
            break;
    }
    System.out.println("Do you wish to order anything else? (Y/N): ");
    again=sc.next();
    if(again.equalsIgnoreCase("Y"))
    order();
    else if(again.equalsIgnoreCase("N"))
    {
        generatebill();
        System.exit(1);
    }
else
System.out.println("Invalid Choice");
    }
}
}