import java.util.Scanner;

class calculator {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // loops the code if you enter an invalid operator
    for (int x = 0; x < 1;) {
      // clears the screen
      System.out.print("\033[H\033[2J");
      System.out.flush();

      // welcome user
      System.out.println("it\'s calculatin\' time");
      System.out.print("type in an expression: ");

      // get input
      String[] inputs = { "", "" };
      String input = scan.nextLine();

      // initialize variables
      String operator = "";

      String operators[] = { "+", "-", "*", "/" };
      String operators1[] = { "\\+", "-", "\\*", "/" };

      // split up input into the first input and second input, also figure out what
      // operator the user wants to use
      for (int i = 0; i < 4; i++) {
        if (input.contains(operators[i])) {
          inputs = input.split(operators1[i], 2);
          operator = operators[i];
          break;
        }
      }

      // initialize variable
      double output = 0.0;

      // increment variable to end for loop
      x++;

      // commit math
      try {
        switch (operator) {
          default:
            // go back into the for loop because invalid operator
            System.out.println("please enter a valid operator (+, -, *, /)");
            input = scan.nextLine();
            x = 0;
            break;
          case "+":
            output = Double.parseDouble(inputs[0]) + Double.parseDouble(inputs[1]);
            break;
          case "-":
            output = Double.parseDouble(inputs[0]) - Double.parseDouble(inputs[1]);
            break;
          case "*":
            output = Double.parseDouble(inputs[0]) * Double.parseDouble(inputs[1]);
            break;
          case "/":
            output = Double.parseDouble(inputs[0]) / Double.parseDouble(inputs[1]);
            System.out.println("remainder: " + Double.parseDouble(inputs[0]) % Double.parseDouble(inputs[1]));
            break;
        }
        // stop problems
      } catch (NumberFormatException a) {
        System.out.println("please enter a valid expression (only 2 numbers)");
        input = scan.nextLine();
        x = 0;
      } catch (ArithmeticException a) {
        System.out.println("the calculator says you can't divide by 0");
        input = scan.nextLine();
        x = 0;
      }

      // print out the result to the expression
      System.out.println(output);

      System.out.println("want to calculate more?");
      input = scan.nextLine();
      if (input!="no"){
        x = 0;
      }
    }
    scan.close();
  }
}
