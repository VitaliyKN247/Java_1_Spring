package hw_1.geekbrains;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person();
        person.setFirstName("Иван");
        person.setLastName("Иванов");
        person.setAge(25);

        // Сериализация в JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Сериализованный объект в JSON: " + json);

        // Десериализация из JSON
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Десериализованный JSON в объект: " + deserializedPerson);

    }
}
