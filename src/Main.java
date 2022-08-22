import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        Scanner myObj = new Scanner(System.in);
        System.out.println("calculator");

        String input = myObj.nextLine();
        String operators[] = {"\\+"};
        String[] inputs = input.split("\\+");

        for(String a : inputs){
            System.out.println(a);
        }
    }
}