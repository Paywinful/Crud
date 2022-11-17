import java.util.Scanner;

public class Delete extends App{
    public void Remove(){
        System.out.println(Arr);
        System.out.println("Enter position of item to be deleted");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Arr.remove(Arr.get(i-1));
        // return 0;
      }
}
