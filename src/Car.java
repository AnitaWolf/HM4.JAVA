public class Car {

    int a;     // По умолчанию примитивные типы равны 0
    double b;


    public Car(int a,double b) {

        this.a = a;
        this.b = b;
    }



    public void printA(){

        System.out.println(a);
    }

    public void printAB(){

        System.out.println(a + " " + b);
    }

    public double div(){
        return  a/b;
    }
}
