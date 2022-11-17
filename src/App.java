import java.util.ArrayList;
import java.util.Scanner;




public class App {

  private static int x;

    static ArrayList<String> Arr = new ArrayList<String>();

    public static int Update(){
      Scanner sc = new Scanner(System.in);
      Scanner sc1 = new Scanner(System.in);
      System.out.println("What is your name?");
      String name = sc.nextLine();
      Arr.add(name); 
      return 0;    
    }

    public static void getSize(){
      x = Arr.size();
      System.out.println("There are " + x + " items");
    }

      static Delete Del = new Delete();

      static Read read = new Read();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        int select;
       for (int i = 0; i < 999999; i++) {
            System.out.println("1. Update");
            System.out.println("2. Read");
            System.out.println("3. Delete");
            System.out.println("4. Check number of items");
            System.out.println("Enter your option");
            select = sc.nextInt();
            
            if(select == 1){
                Update();
            }
            else if(select == 2){
              read.Reading(); 
            }
            else if(select == 3){
                Del.Remove(); 
            }
            else if(select == 4){
              getSize(); 
            } 
            else{
              System.out.println("Please Enter an option in the the given list");
            }
       }
}
}
