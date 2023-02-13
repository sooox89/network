package first;

public class GenericMethodTest1 {
    static class Prints{ // 중첩 클래스 // Generic method
        public static <T> void printArray(T[] arr) {
            for(T a : arr)
                System.out.println(a);
        }

          // method overloading
//        public static void printArray(String[] arr) {
//            for(String a : arr)
//                System.out.println(a);
//        }
//        public static void printArray(Integer[] arr) {
//            for(Integer a : arr)
//                System.out.println(a);
//        }
//        public static void printArray(Double[] arr){
//            for(Double a : arr)
//                System.out.println(a);
//        } // ...
    }

    public static void main(String[] args) {
        Double[] d1 = {3.14, 2.71, 9.9};
        String[] s1 = {"Hi", "Hello"};
        Character[] c1 = {'c', 'b', 'e'};
        Integer[] i1 = {10, 9, 7};
//        Prints.<Double>printArray(d1);
        Prints.printArray(d1);
        Prints.printArray(s1);
        Prints.printArray(c1);
        Prints.printArray(i1);

    }



}
