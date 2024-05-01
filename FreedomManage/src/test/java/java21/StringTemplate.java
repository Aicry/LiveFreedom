package java21;

import lombok.Getter;
import lombok.Setter;

import static java.lang.StringTemplate.STR;

/**
 * @Author Hms
 * @Date 2024/05/01 18:04
 **/
@Setter
@Getter
public class StringTemplate {

    private String name;

    public static void main(String[] args) {

        StringTemplate stringTemplate = new StringTemplate();

        String name = "hms";
        String message = STR."Greetings \{name}!";
        System.out.println(message);

        message = STR."Greetings \{name}!";
        System.out.println(message);
        stringTemplate.setName("hms");
        message = STR."Greetings \{stringTemplate.getName()}!";
        System.out.println(message);

        message = STR."Greetings \{stringTemplate.name}!";
        System.out.println(message);

        int x = 10, y = 20;
        String s = STR."\{x} + \{y} = \{x + y}";  //"10 + 20 = 30"
        System.out.println(s);

    }
}
