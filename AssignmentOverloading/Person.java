public class Person {
    public static void main(String[] args) {

        Person mohan = new Person("mohan",12);
        Person sohan = new Person("sohan", 23, "chennai");
        sohan.getAddress();
    }

     String name;
    int age;
    String address;


    public Person(String name) {
        this.name = name;
        System.out.println("your name is "+ name);
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("hello "+ name +" your age is "+ age+" years.");
    }


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        System.out.println("you are living in "+ address);
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
