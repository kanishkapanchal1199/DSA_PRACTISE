public class Test {
    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(long i) {
        System.out.println("long");
    }
    public void print(int i) {
        System.out.println("int");
        String a="kanishka";
        System.out.println(a.substring(1));
    }



    public static void main(String args[]) {
        Test test = new Test();
        test.print(10);
    }
}