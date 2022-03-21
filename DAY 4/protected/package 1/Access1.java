package package1;


import package2.Access2;

import static package1.Access.six;

public class Access1 extends Access2 {
    public static void one(){
        System.out.println("ONE");
    }
    private static void two(){
        System.out.println("TWO");

    }
    public static void main(String[] args) {
        System.out.println("Access Specifier : ");
        one();
        two();
//      Access a = new  Access();
       Access2 a = new Access2();

     a.three(); // protected

        a.four(); // public

        //  a.five(); //private

        System.out.println(six()); // default


    }
    }
