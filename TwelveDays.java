import java.lang.*;
import java.util.*;
import java.io.*;
class Main {
    public static final String[] days = {"", "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    public static final String[] numbers = {"", "a", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve"};
    public static final String[] gifts = {"", "Partridge in a Pear Tree", "Turtle Doves", "French Hens",
            "Calling Birds", "Gold Rings", "Geese-a-Laying", "Swans-a-Swimming", "Maids-a-Milking", "Ladies Dancing",
            "Lords-a-Leaping", "Pipers Piping", "Drummers Drumming"};
    public static String display1(int a) {
        StringBuilder result = new StringBuilder();
        result.append(String.format("On the %s day of Christmas my true love gave to me: ", days[a]));
        for (int i = a; i > 0; i--) {
            result.append(i == a ? "" : i == 1 ? ", and " : ", ");
            result.append(String.format("%s %s", numbers[i], gifts[i]));
        }
        return result.append(".\n").toString();
    }
    public static String display2(int s, int e) {
        StringBuilder result = new StringBuilder();
        for (int i = s; i <= e; i++) {
            result.append(String.format("%s%s", display1(i), i == e ? "" : "\n"));
        }
        return result.toString();
    }
    public static void main(String args[])
    {
        System.out.println(display2(1,12));
    }
}
