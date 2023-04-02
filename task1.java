//Task_1
//   Вам дается строка S и целочисленный массив индексов int index[s.length].
//// Напишите программу, которая перетасует символы в S таким образом,
//// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// s = “cba”, index = [3,2,1] result “abc”

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        String s = st.nextLine();
        System.out.println("Введите индексы, через запятую в формате 1, 2, 3: ");
        String number = st.nextLine();
        String strArr[] = number.split(", ");
        int[] index = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            index[i] = Integer.parseInt(strArr[i]);
        }
        System.out.print(shuffle(s, index));
    }
    public static String shuffle(final String s, final int[] index){
        String rezult = "";
        for (int i = 0; i < index.length; i++){
            int j = index[i];
            rezult += s.charAt(j - 1);
        }
        return rezult;
    }
}