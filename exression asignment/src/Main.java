
public class Main {
    static int bracket1,bracket2, quotient1,  quotient2, halfdone, done;
    public static void main(String[] args){
        /******
         * For the following expressions, write out the SOP code to show the step by step process the compiler
         * follows to evaluate each expression. The output should be the same for every step.
         *
         * Example:
         *
         * System.out.println(2 * 5 + 3 + 0.37);
         * System.out.println(10 + 3 + 0.37);
         * System.out.println(13 + 0.37);
         * System.out.println(13.37);
         *
         ********** Assignment Criteria********************
         *
         * 1. Only complete one computation per line of code
         * 2. The output for every line is always equal to the same number
         *
         * In the example above the output should be:
         *
         * 13.37
         * 13.37
         * 13.37
         * 13.37
         *
         * *****/

        //Expression 1
        int bracket1 = (5);
        int bracket2 = (-4);
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);
        //i realize i did this like diffrently from whatwas expected bt it took me like a hot min n it still works so yk gotta count for sumthn
    //first the comlier tkaes on the contets of the brackets:
        System.out.println("Step one is taking on the brackets");
        // making to first one 5 by subtraction
        System.out.println("The first bracket is 9-4 so it is now:" + bracket1);
        //thre ssecond bracket becomes -4
        System.out.println("The second bracket is 4-8 so it is now:" + bracket2);
        int quotient1 = 5;
        int quotient2 = -4/3;
    //then it tkes on the division making 10/2 now 5
        System.out.println("Step two is dividing");

        System.out.println("Between the two brackets 10/2 becomes:" + quotient1);
        System.out.println("The second bracket itself is divided by 3 giving us:" + quotient2);

        System.out.println("Now we have" + bracket1 + "+" + quotient1 + "-" + quotient2 );
        int halfdone = bracket1 + quotient1;
        int done = halfdone - quotient2;
        System.out.println("Now we add" + bracket1 + "and" + quotient1 + "together, giving us: "+ halfdone);
        System.out.println("Then you subtract" + quotient2 + "from that and get" + done);




        //Expression 2
        System.out.println(23%4 + (18 - 3 / 2));
        System.out.println(23%4 + (18 - 1.5));
        System.out.println(23%4 + 16.5);
        System.out.println(3 + 16.5);
        System.out.println(19.5);

        //Expression 3
        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        System.out.println(3 + Math.pow(3,4)/5);
        System.out.println(3 + 81/5);
        System.out.println(3 + 16.2);
        System.out.println(19.2);


        //Expression 4
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        System.out.println((1) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        System.out.println(-7 + Math.pow(2,3) / 8 + (9 / 3));
        System.out.println(-7 + Math.pow(2,3) / 8 + 3);
        System.out.println(-7 + 8 / 8 +3 );
        System.out.println(-7 + 1 + 3 );
        System.out.println(-7 + 4);
        System.out.println(-3);

        //Expression 5
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println(((7 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println((10 * Math.sin(45)+ 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println((10 * 0.7071 + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println((7.071 + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println(9.071 - Math.pow(Math.sqrt(25), 3));
        System.out.println(9.071 - Math.pow( 5, 3));
        System.out.println(9.071 - 125);
        System.out.println(-115.929);

    }
}