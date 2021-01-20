import java.util.Scanner;
import java.util.Arrays;

class Main{

  public static void showMenu(String[] menu){

    System.out.println();
    for(String s: menu){
      System.out.println(s);
    }
    System.out.println();

  }

  public static String[] parseItem(String s){

    String[] sp1 = s.split("\\$");
    String price = sp1[1];
    String name = sp1[0].substring(3, sp1[0].length()-4);
    return new String[]{name, price};

  }

  public static void main(String[] args){

    //create restaurant
    Restaurant dtf = new Restaurant("Din Tai Fung", "(818) 551-5561", "177 Caruso Ave, Glendale, CA 91210");
    //create menu
    String[] menu = new String[]{"1) Pork Xiao Long Bao -- $15.00", "2) Shrimp Fried Rice -- $10.50", "3) Sauteed Bok Choy -- $7.25"};
    //create robot waiters
    Robot robo1 = dtf.hireRobot(001);
    Robot robo2 = dtf.hireRobot(002);
    Robot robo3 = dtf.hireRobot(003);
    Robot[] robots = new Robot[]{robo1, robo2, robo3};
    //create chef
    Chef chef = dtf.hireChef(004);
    //view the restaurant staff
    System.out.println(dtf.name + "'s wait staff ");
    System.out.println("Robot "+ robo1.serial + ", " + "Robot " + robo2.serial + ", and Robot " + robo3.serial + " are happy to serve you");
    System.out.println(dtf.name + "'s head chef, Chef " + chef.serial + " will be preparing your meal");
    System.out.println();
    //seat customer
    Scanner sc = new Scanner(System.in);
    System.out.println("which robot would you like as your server?");
    for(Robot r: robots){
      System.out.println(r.serial+") " + "Robot "+r.serial);
    }
    int choice = sc.nextInt();
    while(choice != 1 && choice != 2 && choice != 3){
      System.out.println("please enter the number of one of the robots");
      choice = sc.nextInt();
    }
    Customer customer = dtf.seatCustomer(robots[choice-1]);
    System.out.println("great, right this way to get seated");
    System.out.println();
    //display menu + take order
    System.out.println("Hello, I am Robot " + customer.waiter.serial + ", what may I get for you today?");
    Check check = customer.waiter.openCheck(customer);
    showMenu(menu);
    String done = "n";
    


  }

}
