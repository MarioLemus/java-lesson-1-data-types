interface ExampleInterface {
    String greet();
}

public class Main {
    public static void main(String[] args) {
        /*
        * temas a tocar
        *
        * - tipos de datos
        * - como leer errores
        * - build-in modules
        * */

        /* PRIMITIVE TYPES */

        // int
        int minRangeInt = -2_147_483_648;
        int maxRangeInt = 2_147_483_647;

        // byte: 8-bit signed, max numeric range -128 to 127
        byte minRangeByte = -128;
        byte maxRangeByte = 127;

        // short: 16-bit signed, max numeric range -32,768 to 32,767
        short minRangeShort = -32_768;
        short maxRangeShort = 32_767;

        // long: type can hold large numbers, but to use it you gotta add an L at the end of the amount
        long minRangeLong = -9_223_372_036_854_775_808L;
        long maxRangeLong = 9_223_372_036_854_775_807L;

        // NOTE: FLOAT AND DOUBLE SHOULD BE USED CAREFULLY BECAUSE THEY CAN'T BE SUPER PRECISE FOR SOME OPERATIONS
        // LIKE DEALING WITH MONEY, SO IN CASE OF WANTING SOMETHING PRECISE USED INSTEAD: "BigDecimal"

        // float: aprox. max 7 digits of precision after " . "
        float minRangeFloat = -1.141_514_7f;
        float maxRangeFloat = 1.141_514_7f;

        // double: aprox. max 15 digits of precision after " . "
        double minRangeDouble = -1.141_514_789_123_74;
        double maxRangeDouble = 1.141_514_789_123_74;

        // char: used to save single values numbers, strings, char values represented in Unicode system "\u0061"
        char a = '\u0061';
        char a2 = 'a';

        // boolean
        boolean booleanONOFF = true;

        /* NON-PRIMITIVES TYPES */

        // These types are made by Strings, classes, Objects, interfaces and arrays

        // string
        String word = "bla";

        // number
        Number someNum = 15;

        // interface -> example ate the top of the file "similar to ts"

        // class: formal way of structure data
        class Example implements ExampleInterface {
            public String greet() {
                return "hello from a method";
            }
        }

        // object: saves the reference of a class
        Example obj = new Example();
        obj.greet();

    }
}