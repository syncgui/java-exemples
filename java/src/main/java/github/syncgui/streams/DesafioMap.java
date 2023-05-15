package github.syncgui.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        UnaryOperator<String> interterSt = n -> new StringBuilder(n).reverse().toString();

        Function<String, Integer> conversaoInt = n -> Integer.parseInt(n, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(interterSt)
                .map(conversaoInt)
                .forEach(System.out::println);
    }
}
