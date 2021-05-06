package com.stream;

import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        list.forEach(i -> System.out.println(i));

//        Consumer<Integer> c = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        Consumer<Integer> c1 = integer -> System.out.println(integer);

//        list.forEach(c);
        list.stream().filter(i -> {
            System.out.println("Hi");
            return true;
        }).findFirst();

//        Function<Integer, Integer> f = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer i) {
//                return i*2;
//            }
//        };
//
//        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer i, Integer j) {
//                return i+j;
//            }
//        };
//
//        Stream<Integer> s = list.stream();
//        Stream<Integer> s1 = s.map(f);
//        Integer result = (Integer)s1.reduce(0,b);
//        System.out.println("Result ====  "+result);

//        Now optimizing: Replacing code for f and b to their position by using anonymous class

//        Stream<Integer> s = list.stream();
//        Stream<Integer> s1 = s.map(new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer i) {
//                return i*2;
//            }
//        });
//        Integer result = (Integer)s1.reduce(0,new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer i, Integer j) {
//                return i+j;
//            }
//        });
//        System.out.println("Result ====  "+result);
//    }

//    Now removing boilerplate code for Functional Interface
//        for Function and BinaryOperator Inteface using lambda Expression

        java.util.stream.Stream<Integer> s = list.stream();
        java.util.stream.Stream<Integer> s1 = s.map(i -> i * 2);

//        Integer result = s1.reduce(0, (Integer i, Integer j) -> i + j);
//        Next step: Changing to c -> carry and e -> value
//        Integer result = s1.reduce(0, (c, e) -> c + e);

//        Next step: Directly use map
//        Integer result = s.map(i -> i * 2).reduce(0, (c, e) -> c + e);

//        Next step : Directly use stream function
//         result = list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e);

//         Now directly printing result value without variable.
        System.out.println("Result ====  " + list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
        System.out.println("Result ====  " + list.stream().map(i -> i * 2).reduce(0, (c, e) -> Integer.sum(c,e)));
        System.out.println("Result ====  " + list.stream().map(i -> i * 2).reduce(0, Integer::sum));


        List<Integer> values = Arrays.asList(21,25, 35, 48, 55, 67, 79);
//        Add all numbers divided by 5.
        int sum=0;
        for (int i: values){
            if (i%5==0){
                sum+=i;
            }
        }
        System.out.println("Sum = "+sum);
//        Using stream
        System.out.println(values.stream().filter(i -> i%5==0).reduce(0,(c,e) -> c+e));

//        Modified code.
//        If you want to multiply values before sum
        System.out.println("Sum using stream and multiplying by 2 == "+values.stream()
                                 .filter(i -> i%5==0)
                                 .map(i -> i*2)
                                 .reduce(0,(c,e) -> c+e));

//        Finding first no. divisible by two
        System.out.println("First no. divisible by 5 == "+values.stream().filter(i -> i%5==0).findFirst().orElse(0));

    }
}
