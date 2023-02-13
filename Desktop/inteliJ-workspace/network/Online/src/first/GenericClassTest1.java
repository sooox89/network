package first;

public class GenericClassTest1 {
    public static void main(String[] args) {
//        PostBox<String> postBox = new PostBox<String>();
        PostBox<String> postBox1 = new PostBox<>();
        PostBox<Integer> postBox2 = new PostBox<>();
        postBox1.setItem("소포");
        postBox2.setItem(77);
//        postBox.setItem(77);  // 타입 mismatch
        System.out.println(postBox1.getItem());
        System.out.println(postBox2.getItem());
    }
}
