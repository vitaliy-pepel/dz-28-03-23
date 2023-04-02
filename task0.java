//Task_0. Посчитайте сколько драгоценных камней в куче обычных камней
//Пример:
//jewels = “aB”, stones = “aaaAbbbB”
//Результат в консоль ”a3B1”

import java.util.Scanner;

public class task0 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String jewels = st.nextLine();
        String stones = st.nextLine();

        System.out.print(findJewelsInStones(jewels, stones));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        char[] arr_j = jewels.toCharArray();
        char symbol_a = arr_j[0];
        char symbol_b = arr_j[1];
        int counter_a = 0;
        int counter_b = 0;
        for (int i = 0; i < stones.length(); i++)
        {
            if (stones.charAt(i) == symbol_a) {
                counter_a++;
            }
            if (stones.charAt(i) == symbol_b) {
                counter_b++;
            }
        }
        String answer = String.valueOf(symbol_a) + String.valueOf(counter_a) + String.valueOf(symbol_b) + String.valueOf(counter_b);
        return answer;
    }

}