class  Vehicle{
    String name;


    Vehicle(String name){

        this.name = name;
    }


    public  void start() {
        System.out.println(this.name+" vehicles is accelerating....");
    }

    public  void stop() {
        System.out.println(this.name+" vehicles is applied break ....");
    }
}


class Bike extends Vehicle{
    Bike(String name) {
        super(name);
    }

    @Override
    public void stop() {
        System.out.println(name+" is stoping");
    }

    @Override
    public void start() {
        System.out.println(name+" is starting");
    }
}


class Car extends Vehicle{
    Car(String name) {
        super(name);
    }

    @Override
    public void stop() {
        System.out.println(name+" is stoping");
    }

    @Override
    public void start() {
        System.out.println(name+" is starting");
    }
}


public  class  Main2{
    public static void main(String[] args) {
        Car Fortuner = new Car("toyota");
        Fortuner.start();

        Bike honda = new Bike("hero honda");
        honda.stop();
    }

}