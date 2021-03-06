package com.example.demo.util;

import java.util.stream.Stream;

/**
 * Created by xuwencong on 2018/8/6
 */
public class LambdaUtil {
    public static void main(String[] args) {
    // 字符串连接，concat = "ABCD"
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        // 求最小值，minValue = -3.0
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
       // 求和，sumValue = 10, 有起始值
        int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
      // 求和，sumValue = 10, 无起始值
        sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
// 过滤，字符串连接，concat = "ace"
        concat = Stream.of("a", "B", "c", "D", "e", "F").
        filter(x -> x.compareTo("Z") > 0).
                reduce("", String::concat);

        System.out.println("concat:"+concat);
//        String strA = " abcd ", strB = null;
//        print(strA);
//        print("");
//        print(strB);
//        getLength(strA);
//        getLength("");
//        getLength(strB);
//        public static void print(String text) {
//            // Java 8
//            Optional.ofNullable(text).ifPresent(System.out::println);
//            // Pre-Java 8
//            if (text != null) {
//                System.out.println(text);
//            }
//        }
//        public static int getLength(String text) {
//            // Java 8
//            return Optional.ofNullable(text).map(String::length).orElse(-1);
//            // Pre-Java 8
//// return if (text != null) ? text.length() : -1;
//        };
    }
}
