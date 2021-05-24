public class Continue {
    public static void main(String[] args){
        for (int n = 0; n < 10; n++){
            if (n % 2 ==0){
                continue;
            }
            System.out.println("Number = "+ n +"....");
        }
        return;
    }
}
