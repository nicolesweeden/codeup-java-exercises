public class Person {
    private String name;

    private String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + this.name + ".");
    }

    public Person(String name) {
        this.name = name;
    }//lines 19-21 are our constructor

    public static void main(String[] args) {
        Person person1 = new Person("Nicole");
        System.out.println(person1.getName());
    }
}
