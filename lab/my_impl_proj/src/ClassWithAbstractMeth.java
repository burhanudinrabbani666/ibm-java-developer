public abstract class ClassWithAbstractMeth {

    public abstract Integer absMeth1(String str);

    protected abstract String absMeth2();

    public abstract String absMeth3(Integer num);

    protected abstract Boolean absMeth4(String str);

    abstract Float absMeth5(Integer num, String str);

    public static void main(String[] args) {
        System.out.println("This is a class with abstract methods");
    }

}
