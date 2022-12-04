public class Main {

   //5**) Сделать реверс строки
    public static String reverse (String str) {
        return new StringBuilder(str).reverse().toString();



    }

    public static void main(String[] args) {



        String str="Арозаупаланалапуазора";
        str=reverse (str);
        System.out.println(str);


    //1) Работа со String

        str="Мороз";
        str+=" и солнце! ";
        str=str+" День чудесный!";
        System.out.println(str);

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        str= "   " + str +"   ";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str.length());

        String subString= str.substring(18);

        System.out.println(subString);

        String subStr = str.substring(8, 18);
        System.out.println(subStr);

        System.out.println(str.charAt(9));











        //2) Продемонстировать явное и неявное приведение типов
        /*int a;
        double b;

        b=5.69;
        a=(int)b;
        System.out.println(a);

        a=35;
        b=a;
        System.out.println(b);*/


        //3) Показать переполнение

        /*short a;
        short b=32767;
        short c=1;
       a=(short) (b+c);
        System.out.println(a);*/

        byte a;
        byte b=127;
        byte c=1;
        a=(byte) (b+c);
        System.out.println(a);


        Car car = new Car(83,67.1);           // Иллюстрация работы с методами

        car.printA();

        car.printAB();

        System.out.println(car.div());




    }






}
    /*
    1) Работа со String
    2) Продемонстировать явное и неявное приведение типов
    3) Показать переполнение
    4*) Показать работу с методами и *классами
    5**) Сделать реверс строки
     */