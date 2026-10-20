import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Kid kid = new Kid();
        System.out.println("Hello, World!");
        MethodTester.testMethod();
        Scanner gameInput = new Scanner(System.in);
        System.out.println("Say hi");
        String hi = gameInput.nextLine();
        if (hi.equalsIgnoreCase("hi")){
        Kid.youngHello();    
        }
        System.out.println("Say bye");
        String bye = gameInput.nextLine();
        if (bye.equalsIgnoreCase("bye")){
        Kid.youngBye();    
        }
        System.out.println("Say huh");
        String conf = gameInput.nextLine();
        if (conf.equalsIgnoreCase("huh")){
        Kid.youngConfused();    
        }
        System.out.println("Say yay");
        String happy = gameInput.nextLine();
        if (happy.equalsIgnoreCase("yay")){
        Kid.youngHappy();    
        }
    }
}












