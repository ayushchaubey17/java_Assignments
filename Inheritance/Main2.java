abstract class  Main{
   static {
        System.out.println("static parrent");  //1
    }


    abstract void ayu();

  final void ayu2() {

    }

   Main() {
        System.out.println("cons parrent");  //4
    }



}

public abstract class Main2 extends Main {
    static {
        System.out.println("static child");  //2
    }

    abstract  void piy();
    {
        System.out.println("intsnce child");  //5
    }


    Main2() {
        System.out.println("cons child");  //6
    }

    public static void main(String[] args) {
        System.out.println("dfds");
    }
}


class pq extends Main2 {

    void  ayu(){}
    void piy(){}

}
