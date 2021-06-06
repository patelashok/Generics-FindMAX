package com.generics;
public class PrintArray<E>{
    E[] myArray;
    public PrintArray(E[] myArray){
        this.myArray=myArray;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        Double[] b = {1.1, 2.2, 3.3, 4.4};
        Character[] c = {'a', 'b', 'c'};
        //Static method
        toPrint(a);
        toPrint(b);
        toPrint(c);

        new PrintArray<Integer>(a).toPrint();
        new PrintArray<Double>(b).toPrint();
        new PrintArray<Character>(c).toPrint();
    }

    private void toPrint()
    {
        toPrint(myArray);
    }
    //Using Generics Print Array
    //<E> by default extends object
    private static <E> void toPrint(E[] x) {
        for (E i : x) {
            System.out.println(i);
        }
    }
}
