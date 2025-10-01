public class Assignment1a {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


                // Arithmetic Operators
                int a = 15;
                int b = 5;
                System.out.println("Arithmetic Operators:");
                System.out.println("a + b = " + (a + b));
                System.out.println("a - b = " + (a - b));
                System.out.println("a * b = " + (a * b));
                System.out.println("a / b = " + (a / b));
                System.out.println("a % b = " + (a % b));
                System.out.println();

                // Logical Operators
                boolean x = true;
                boolean y = false;
                System.out.println("Logical Operators:");
                System.out.println("x && y = " + (x && y));
                System.out.println("x || y = " + (x || y));
                System.out.println("!x = " + (!x));
                System.out.println();

                // Unary Operators
                int c = 10;
                System.out.println("Unary Operators:");
                System.out.println("c = " + c);
                System.out.println("++c = " + (++c)); // pre-increment
                System.out.println("c++ = " + (c++)); // post-increment
                System.out.println("c = " + c);
                System.out.println("--c = " + (--c)); // pre-decrement
                System.out.println("c-- = " + (c--)); // post-decrement
                System.out.println("c = " + c);
                System.out.println();

                // Assignment Operators
                int d = 20;
                System.out.println("Assignment Operators:");
                d += 5; // d = d + 5
                System.out.println("d += 5: " + d);
                d -= 3; // d = d - 3
                System.out.println("d -= 3: " + d);
                d *= 2; // d = d * 2
                System.out.println("d *= 2: " + d);
                d /= 4; // d = d / 4
                System.out.println("d /= 4: " + d);
                d %= 3; // d = d % 3
                System.out.println("d %= 3: " + d);
                System.out.println();

                // Ternary Operator
                int max = (a > b) ? a : b;
                System.out.println("Ternary Operator:");
                System.out.println("Maximum of a and b = " + max);
                System.out.println();

                // Relational Operators
                System.out.println("Relational Operators:");
                System.out.println("a > b = " + (a > b));
                System.out.println("a < b = " + (a < b));
                System.out.println("a >= b = " + (a >= b));
                System.out.println("a <= b = " + (a <= b));
                System.out.println("a == b = " + (a == b));
                System.out.println("a != b = " + (a != b));
                System.out.println();

                // Bitwise Operators
                int e = 12; // 1100 in binary
                int f = 5;  // 0101 in binary
                System.out.println("Bitwise Operators:");
                System.out.println("e & f = " + (e & f));
                System.out.println("e | f = " + (e | f));
                System.out.println("e ^ f = " + (e ^ f));
                System.out.println("~e = " + (~e));
                System.out.println("e << 1 = " + (e << 1));
                System.out.println("e >> 1 = " + (e >> 1));
                System.out.println();

                // Shift Operators
                System.out.println("Shift Operators:");
                System.out.println("f << 2 = " + (f << 2));
                System.out.println("f >> 2 = " + (f >> 2));
                System.out.println();

                // InstanceOf Operator
                String str = "Hello";
                System.out.println("InstanceOf Operator:");
                System.out.println("str is instance of String? " + (str instanceof String));
                System.out.println("str is instance of Object? " + (str instanceof Object));


    }
}