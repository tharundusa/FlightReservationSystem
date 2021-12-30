
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
          ArrayList<Passenger> passengers=new ArrayList<>();
          Scanner sc=new Scanner(System.in);
          while(true){
              System.out.println("enter your name");
              String name=sc.nextLine();
              if(name.isEmpty()){
                  break;
              }
              System.out.println("enter your emailid");
              String emailId=sc.nextLine();
              System.out.println("enter your password");
              String password= sc.nextLine();
              System.out.println("enter your address");
              String address=sc.nextLine();
              System.out.println("enter phonenumber");
              long phoneNumber=sc.nextLong();
              passengers.add(new Passenger(password,name,phoneNumber,emailId,address));
          }

    }
}
