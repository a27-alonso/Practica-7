public class While {
    public static void main(String[] args){
        int count = 10;
        do{
            System.out.println("Counting " +count + "...." );
            count--;
        }while (count > 0);

        System.out.println("\n");

        while (count < 10){
            System.out.println("Counting " + count + "....");
            count++;
        }
        return;
    }
}
