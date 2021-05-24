public class Example {

    private Example() {
    }

    protected void printMessage(int number){
        switch (number) {
            case 1 -> System.out.println("Hello world!");
            case 2 -> System.out.println("Foo bar");
            case 3 -> System.out.println("Teel me a joke");
            default -> System.out.println("No message set for this option");
        }
    }
    public static void main(String[] args) {
        Example exampleApp = new Example();

        int option = exampleApp.asknumber();
        if (option > 0) {
            exampleApp.printMessage(option);
        }else{
            System.out.println("Number must be greater than zero");
        }
    }

    private int asknumber() {
        return 0;
    }
}
