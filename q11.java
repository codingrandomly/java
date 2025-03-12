class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    public void comparePerson(Person p) {
        if (this == p) {
            System.out.println("Both are the same person.");
        } else {
            System.out.println("They are different people.");
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        person1.displayDetails();
        person1.setName("Charlie");
        System.out.println("\nAfter name change:");
        person1.displayDetails();
        System.out.println("\nComparing person1 with person2:");
        person1.comparePerson(person2);
        System.out.println("\nComparing person1 with itself:");
        person1.comparePerson(person1);
    }
}
