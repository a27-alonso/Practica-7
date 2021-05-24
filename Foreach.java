public class Foreach {

    public static void main(String[] args){
        int[] even_numbers = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int number : even_numbers) {
            System.out.println("Number = " + number + "....");
        }
        return;
    }
}
