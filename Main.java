package _22_06_2023;

import java.util.*;


/*


-Напишите программу, которая находит сумму всех элементов в заданном массиве arr и выводит ее значение.
-Напишите программу, которая находит среднее арифметическое значение элементов в заданном массиве arr и выводит его.


 */
public class Main {
    public static void main(String[] args) {
        /*
        - У вас есть Map<String, Boolean>, представляющая студентов и их оценки
(true - сдал экзамен, false - не сдал).
Напишите функцию, которая находит и возвращает имена студентов, не сдавших экзамен.
         */
        Map<String, Boolean> students = new HashMap<>();
        students.put("Elena", true);
        students.put("Vlad", false);
        students.put("Vladimir", true);
        students.put("Masha", false);
        System.out.println("Список студентов6 которые не сдали экзамен: " + findStudent(students));

/*
- У вас есть Map<String, Boolean>, представляющая список продуктов в магазине и
информацию о их наличии (true - продукт в наличии, false - продукта нет).
Напишите функцию, которая подсчитывает количество продуктов, которых нет в наличии.
 */
        Map<String, Boolean> prod = new HashMap<>();
        prod.put("Apple", false);
        prod.put("Orange", true);
        prod.put("Mango", true);
        prod.put("Pineapple", false);
        System.out.println("Количество продуктов, которых нет в магазине: " + findFood(prod));

/*
- У вас есть список List<String>, содержащий имена людей.
Напишите программу, которая выводит все имена, начинающиеся на определенную букву.
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
char targetLetter = 'C';
 */
        List<String> names = Arrays.asList("Lena", "Masha", "Anton", "Galina");
        char target = 'A';
        List<String> filtNames = new ArrayList<>();
        for (String name : names) {
            if (name.charAt(0) == target) {
                filtNames.add(name);
            }
        }
        System.out.println("Имена начинающиеся с бьуквы: " + target + ": " + filtNames);

/*
- У вас есть список List<String>, содержащий слова.
Напишите программу, которая находит все пары слов, в которых первое слово является обратным написанию второго слова.
List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");
 */
        List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");
        List<String> pairs = findWordPairs(words);
        System.out.println("Пары слов, в которых первое слово является обратным написанием: " + pairs);


        /*
        -Напишите программу, которая принимает на вход двумерный
массив int[][] и возвращает сумму всех элементов в массиве.
         */
        int[][] arr = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9, 12}};
        System.out.println("Сумма всех элементов двумерного массива: " + getSum(arr));

        /*
        -Напишите программу, которая принимает на вход двумерный массив
int[][] и возвращает максимальное значение среди всех элементов в массиве.
         */
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int max = findMax(array);
        System.out.println("Максимальное значение двумерного массива: " + max);

/*
Напишите программу, которая принимает массив строк String[] и
возвращает новый массив, содержащий только уникальные строки из исходного массива
 */
        String[] arr1 = {"apple", "banan", "mango", "apple", "banan"};
        List<String> unStrings = getString(arr1);
        System.out.println("Уникальные строки из исхоного массива: " + unStrings);


        /*
    Напишите программу, которая принимает массив строк String[]
и возвращает новый массив строк, в котором все строки перевернуты задом наперёд.
     */
        String[] strings = {"apple", "banan", "mango"};
        String[] reversStrings = reverseStrings(strings);
        System.out.println("Массив перевернутых строк: " + Arrays.toString(reversStrings));


/*
Напишите функцию, которая принимает на вход Set<String>
и возвращает новый Set<String>, содержащий только те строки, которые начинаются с заглавной буквы.
 */
        Set<String> inputSet = new HashSet<>();
        inputSet.add("Apple");
        inputSet.add("banan");
        inputSet.add("Carrot");
        inputSet.add("Dog");
        inputSet.add("cat");
        System.out.println("Строки начинающиеся с заглавной буквы: " + findUpLetter(inputSet));


/*
Напишите функцию, которая принимает на вход два Set<String> и
возвращает новый Set<String>, содержащий только те строки, которые присутствуют в обоих наборах.
 */
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banan");
        set1.add("orange");
        Set<String> set2 = new HashSet<>();
        set2.add("banan");
        set2.add("mango");
        set2.add("kiwi");
        Set<String> result = newSet(set1, set2);
        System.out.println("Повторяющиеся элемпнты из set1 и set2: " + result);


/*
Напишите функцию, которая принимает на вход Set<String> и возвращает
новый Set<String>, содержащий только уникальные строки, игнорируя регистр символов
Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("banana");
        stringSet.add("apple");
        stringSet.add("Banana");
 */
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("banana");
        stringSet.add("apple");
        stringSet.add("Banana");

        Set<String> uniqueSet = ignoreRegistr(stringSet);
        System.out.println(uniqueSet);


    }

    /**
     * метд для вывода списка  студентов, не сдавших экзамен
     * @param student
     * @return
     */
    public static List<String> findStudent(Map<String, Boolean> student) {
        List<String> failStudents = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : student.entrySet()) {
            if (!entry.getValue()) {
                failStudents.add(entry.getKey());
            }
        }
        return failStudents;
    }

    /**
     * метод для подсчитывания продуктов, которых нет в магазине
     * @param foodMap
     * @return
     */
    public static int findFood(Map<String, Boolean> foodMap) {
        int count = 0;
        for (Map.Entry<String, Boolean> entry : foodMap.entrySet()) {
            if (!entry.getValue()) {
                count++;
            }
        }
        return count;
    }

    /**
     * метод для поиска пар слов с перевернутым значением(метод isReverse прописан ниже)
     * @param words
     * @return
     */
    public static List<String> findWordPairs(List<String> words) {
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String word1 = words.get(i);
            for (int j = i + 1; j < words.size(); j++) {
                String word2 = words.get(j);
                if (isReverse(word1, word2)) {
                    pairs.add(word1 + " и " + word2);

                }
            }

        }
        return pairs;
    }

    /**
     * метод для проверки переворачиваемых слов для метода выше
     * @param word1
     * @param word2
     * @return
     */
    public static boolean isReverse(String word1, String word2) {
        StringBuilder reversWord2 = new StringBuilder(word2).reverse(); //создаем объект StringBuilder со значением слово2,
        // через метод реверс(от класса StringBuilder) переворачиваем и сохраняем в переменную реверсворд2
        return word1.equals(reversWord2.toString());//сравниваем через equals ворд1 и реверсворд2(возвращает true, если равны по обратности)
    }

    /**
     * метод для нахождения суммы двойного массива
     * @param arr
     * @return
     */
    public static int getSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    /**
     * метод поиска макисмального значения в двойном массива
     * @param array
     * @return
     */
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    /**
     * метод вовзращает уникальные строки из массива
     * @param arr1
     * @return
     */
    public static List<String> getString(String[] arr1){
        Set<String> unSet = new HashSet<>();
        List<String> unList = new ArrayList<>();

        for (String str : arr1) {
            if (unSet.add(str))
                unList.add(str);

        }
        return unList;
    }


    /**
     * метод для переворачивания символов массива строк
     * @param array
     * @return
     */

    public static String[] reverseStrings(String[] array) {
        String[] reversArray = new String[array.length]; //массив для хранения перевернутых строк той же длины что и исходный массив
        for (int i = 0; i < array.length; i++) {
            String origString = array[i];//исходная строка из входного массива
            String reversString = ""; //для хранения перевернутой строки
            for (int j = origString.length() - 1; j >= 0; j--) {//проходим по символам исходной строки
                char ch = origString.charAt(j);//получаем символы исходной строки(метод чатЭт)
                reversString += ch; //добавляем символ в начало перевернутой строки
            }
            reversArray[i] = reversString;//сохраняем перевернутую строку в reversString
        }
        return reversArray;//возвращаем масив перевернутых строк
    }

    /**
     * метод возвращает только строки, которые начинаются с заглавной буквы
     * @param inputSet
     * @return
     */
    public static Set<String> findUpLetter(Set<String> inputSet) {
        Set<String> result = new HashSet<>();
        for (String str : inputSet) {
            if (Character.isUpperCase(str.charAt(0))) {//проверяем первый символ String str - заглавная или нет (метод isUpperCase класса Character)
                result.add(str);//если да - кладем в результ
            }
        }
        return result;
    }

    /**
     * метод принимает 2 сета и возвращает только дубликаты из обеих сетов
     * @param set1
     * @param set2
     * @return
     */
    public static Set<String> newSet(Set<String> set1, Set<String> set2) {
        set1.retainAll(set2); //через метод retainAll класса сет проверяет каждый элемпнт в сет1 и удалет те, которые есть в сет2
        return set1;
    }

    /**
     * метод принимает строки и возвращает уникальные строки без учета региста
     * @param strSet
     * @return
     */
    public static Set<String> ignoreRegistr(Set<String> strSet) {
        Set<String> unStr = new HashSet<>();//здесь храним уникальные строки
        Set<String> lowerСase = new HashSet<>();//здесь приведенные к нижнему регистру
        for (String str : strSet) {
            String lowercaseStr = str.toLowerCase();//приводим строку к нижнему регистру - метод toLowerCase и сохранем в lowercaseStr
            if (!lowerСase.contains(lowercaseStr)) {//проверяем есть ли уже эта строка в lowercaseStr
                unStr.add(str); //если нет -добавляем в уникальную unStr
                lowerСase.add(lowercaseStr);// и в lowerСase(чтобы видеть уже присутствующие строки, которые приведены к нижнему регистур
            }
        }
        return unStr;
    }



}
