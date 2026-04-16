class Variable {
    static int num;

    static {
        num = 50;
        System.out.println("Static block initialized num = " + num);
    }

    public static void main(String[] args) {
        System.out.println("Value of num = " + num);
    }
}