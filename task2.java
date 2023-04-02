//На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги.
//        потом вводится натуральное число m - количество продуктов, на которые у человека аллергия.
//        Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия
//        и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова.
//        название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
//        Выходные данные
//        Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!!
//        Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
//
//        Sample Input:
//        2
//        Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
//        Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
//        3
//        арахис - колбаса
//        клубника - вишня
//        сгущенка - молоко
//        Sample Output:
//        Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
//        Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

import java.util.Scanner;

public class task2{
    public static void main(String[] args) {

        /*Получаем текст для замены*/
        Scanner n = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int ns = n.nextInt();
        String[] text = new String[ns];                 //Добавляем текст в список
        for (int i = 0; i < ns; i++) {
            String s = b.nextLine();
            text[i] = s;
        }

        /*Получаем еду и делим на 2 списка*/
        int index = 0;
        int allergens = n.nextInt();
        String[] bad_food = new String[allergens];      //список с аллергенами
        String[] good_food = new String[allergens];     //список с заменителями
        for (int j = 0; j < allergens; j++) {
            String s = b.nextLine();
            String[] food = s.split(" - ");
            bad_food[index] = food[0];
            good_food[index] = food[1];
            index++;
        }
        /*Заменяем еду на заглавные буквы*/
        String[] bad_food_top = new String[allergens];      //список с аллергенами с заглавной буквы
        String[] good_food_top = new String[allergens];     //список с заменителями с заглавной буквы
        for (int h = 0; h < bad_food.length; h++){
            bad_food_top[h] = bad_food[h].substring(0, 1).toUpperCase() + bad_food[h].substring(1);
            good_food_top[h] = good_food[h].substring(0, 1).toUpperCase() + good_food[h].substring(1);
        }

        /*Заменяем аллергены*/
        for (int y = 0; y < text.length; y++){
            String text_for_rep = text[y];
            for (int x = 0; x < bad_food.length; x++){
                    text_for_rep = text_for_rep.replace(bad_food[x], good_food[x]);
                    text_for_rep = text_for_rep.replace(bad_food_top[x], good_food_top[x]);
            }
            System.out.println(text_for_rep);
        }
    }
}