package first;

public class GenericMethodTest2 {

    static class Prints{ // 중첩 클래스 // Generic method
        public static <T extends Number> void printArray(T[] arr) {
            for(T a : arr)
                System.out.println(a);
        }

    }

    public static void main(String[] args) {
        Double[] d1 = {3.14, 2.71, 9.9};
        String[] s1 = {"Hi", "Hello"};
        Character[] c1 = {'c', 'b', 'e'};
        Integer[] i1 = {10, 9, 7};
//        Prints.<Double>printArray(d1);

    // Number 클래스의 자식 클래스로 제한해서 문자, 문자열 배열은 사용 불가
//        Prints.printArray(s1);
//        Prints.printArray(c1);
        Prints.printArray(i1);
        Prints.printArray(d1);

    }



}