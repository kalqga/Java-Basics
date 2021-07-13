package for_loop.exercises;

public class numbers_ending_in_7 {
    public static void main(String[] args) {

        for (int i = 7; i <= 997; i++) {
            if (i % 10 == 7){
                System.out.println(i);
            }
        }

    }
}
