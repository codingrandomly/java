public class PrimitiveDataTypesInfo {
    public static void main(String[] args) {
        System.out.println("Data Type\tSize (in bytes)\tMin Value\t\t\tMax Value");
        System.out.println("byte\t\t" + Byte.BYTES + "\t\t\t" + Byte.MIN_VALUE + "\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t\t" + Short.BYTES + "\t\t\t" + Short.MIN_VALUE + "\t" + Short.MAX_VALUE);
        System.out.println("int\t\t" + Integer.BYTES + "\t\t\t" + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);
        System.out.println("long\t\t" + Long.BYTES + "\t\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("float\t\t" + Float.BYTES + "\t\t\t" + Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
        System.out.println("double\t\t" + Double.BYTES + "\t\t\t" + Double.MIN_VALUE + "\t" + Double.MAX_VALUE);
        System.out.println("char\t\t" + Character.BYTES + "\t\t\t" + (int)Character.MIN_VALUE + "\t" + (int)Character.MAX_VALUE);
        System.out.println("boolean\t\t1 (approx.)\t\t\tN/A\t\t\t\tN/A");
    }
}
