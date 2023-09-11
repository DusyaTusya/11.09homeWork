package HomeWork1;


import java.util.HashMap;
import java.util.Map;


public class task1 {
    public static void main(String[] args) {
        Map<String, String> telephoneDirectory = new HashMap<>(); // создаем пустой телефонный справочник
        telephoneDirectory.put("Ivanov", "8-111-1231212"); // добавляем фамилии и номера телефонов
        telephoneDirectory.put("Ivanov", telephoneDirectory.get("Ivanov") + ", 8-111-1231244"); // добавляем второй номер иванову
        telephoneDirectory.put("Petrov", "8-111-1223212");
        telephoneDirectory.put("Sidorov", "8-111-1099912");
        String removeKey = "Ivanov";
        if (telephoneDirectory.containsKey(removeKey)){
            System.out.println(telephoneDirectory.get(removeKey)); // выводим на консоль телефонные номера по заданному ключу
                 }
        else {
            System.out.printf("Не найдена запись фамилией %s%n", removeKey); // если указанного ключа нет, сообщаем об этом
            }

        if (telephoneDirectory.containsKey(removeKey)){
                telephoneDirectory.remove(removeKey); // удаляем данные по заданному ключу
                }
        else {
            System.out.printf("Не найдена запись фамилией %s%n", removeKey); // если ключ не найден, сообщаем об этом
                }
         
    telephoneDirectory.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
     
    }
    
}
