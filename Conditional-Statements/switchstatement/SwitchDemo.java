package switchstatement;

public class SwitchDemo {
    public static void main(String[] args) {

        int number = 3;

        switch (number) {
            case 0:
                System.out.println("Go back to menu");
                break;
            case 1:
                System.out.println("Switch on AC");
                break;
            case 2:
                System.out.println("Switch on Fan");
                break;
            case 3:
                System.out.println("Switch on Lights");
                break;
            default:
                System.out.println("Invalid option");
        }

    }
}
