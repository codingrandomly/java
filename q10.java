public class StaticDemo {
    static int staticCount = 0;
    static {
        System.out.println("Static block is executed!");
        staticCount = 10; 
    }
    public static void displayCount() {
        System.out.println("Static variable staticCount: " + staticCount);
    }
    public void incrementCount() {
        staticCount++;
        System.out.println("Incremented staticCount: " + staticCount);
    }
    public static void main(String[] args) {
        StaticDemo.displayCount();
        StaticDemo demo1 = new StaticDemo();
        demo1.incrementCount(); 
        StaticDemo.displayCount();
        StaticDemo demo2 = new StaticDemo();
        demo2.incrementCount();
        StaticDemo.displayCount();
    }
}
