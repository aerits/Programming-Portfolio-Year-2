public class hungman {
    public static void main(String[] args) {
        int percent=90;
        int bruh = (percent/(100/7));
        System.out.println(bruh);
        switch (bruh) {
            case 7:
                System.out.print("---  ");
            case 6:
                System.out.print(" o");
            case 5:
                System.out.print("\n/");
            case 4:
                System.out.print("|");
            case 3:
                System.out.print("\\");
            case 2:
                System.out.print("\n/");
            case 1:
                System.out.print(" \\\n");
                break;
        }
    }
}
