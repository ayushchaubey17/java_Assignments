public class MathOperations {
    public static void main(String[] args) {
        add(2,3);
        add(3.4f,5.7f);
        add(454.3, 323.45);
    }

    public static void add(int a, int b) {
        System.out.println(a+b);
    }

    public static void add(float a, float b) {
        System.out.println(a + b);
    }

    public static void sub(int a, int b) {
        System.out.println(a-b);
    }

    public static  void  sub(float a,float b) {
        System.out.println(a-b);
    }
    public static void mul(int a, int b) {
        System.out.println(a*b);
    }

    public static  void  mul(float a,float b) {
        System.out.println(a*b);
    }
    public static void div(int a, int b) {
        if(b==0) return;
        System.out.println(a/b);
    }

    public static  void  div(float a,float b) {
        if (b==0) return;
        System.out.println(a/b);
    }


    public  static  void  add(double a, double b) {
        System.out.println(a+b);
    }

    public  static  void  sub(double a, double b) {
        System.out.println(a-b);
    }

    public  static  void  mul(double a, double b) {
        System.out.println(a*b);
    }

    public  static  void  div(double a, double b) {
        if(b==0) return;
        System.out.println(a/b);
    }

}
