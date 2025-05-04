package Classesutilitarias.Wrappers106.test;
// video 106 - wrappers pt 01
public class WrapperTest01 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 1;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        // classes wrapper transformam tipos primitivos em objetos;

        int a = 5;
        modificar(a);
        System.out.println(a);

        // video 107 - Wrappers pt 2

        Integer intW2 = 1; // autoboxing
        int i = intW2; // unboxing
        Integer intW3 = Integer.parseInt("4");
        Boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);


    }
    public static void modificar(int x) {
        x = 10; // o valor da variável original não é alterada pelo mét0do
    }
}
