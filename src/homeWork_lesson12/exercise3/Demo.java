package homeWork_lesson12.exercise3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla");
        String str = "Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla";

        String tmpStr = "Object-oriented programming";
        String newStr = "OOP";
        System.out.println(replace(stringBuilder, tmpStr, newStr));
    }



    private static StringBuilder replace(StringBuilder stringBuilder, String str, String subString) {
        int pos;
        int end = str.length();
        while ((pos = stringBuilder.indexOf(str)) != -1) {
            stringBuilder.delete(pos, end);
            stringBuilder.insert(pos, subString);
        }

        return stringBuilder;
    }
}

