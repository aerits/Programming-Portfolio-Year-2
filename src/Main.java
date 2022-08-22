import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        Scanner myObj = new Scanner(System.in);
        System.out.println("calculator");

        String[] inputs = {"", ""};
        String input = myObj.nextLine();
        myObj.close();

        String operator="";

        String operators[] = {"+", "-", "*", "/"};
        String operators1[] = {"\\+", "-", "\\*", "/"};

        for(int i=0;i<4;i++){
            if(input.contains(operators[i])){
                inputs = input.split(operators1[i], 2);
                operator=operators[i];
                break;
            }
        }

        int output = 0;

        switch(operator){
            case "+":
                output=Integer.parseInt(inputs[0])+Integer.parseInt(inputs[1]);
                break;
            case "-":
                output=Integer.parseInt(inputs[0])-Integer.parseInt(inputs[1]);
                break;
            case "*":
                output=Integer.parseInt(inputs[0])*Integer.parseInt(inputs[1]);
                break;
            case "/":
                output=Integer.parseInt(inputs[0])/Integer.parseInt(inputs[1]);
                break;
        }

        System.out.println(output);
    }
}