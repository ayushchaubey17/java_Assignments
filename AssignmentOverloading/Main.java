public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Anmol");
        Person person2 = new Person("sharma", 30);
        Person person3 = new Person("rohni", 50, "vadapalani");

        // Print details
        System.out.println("Person 1: " + person1.getName());
        System.out.println("Person 2: " + person2.getName() + ", Age: " + person2.getAge());
        System.out.println("Person 3: " + person3.getName() + ", Age: " + person3.getAge() +
                ", Address: " + person3.getAddress());
    }
}
