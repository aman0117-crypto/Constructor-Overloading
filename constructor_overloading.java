package constructor;

public class constructor_overloading {

    String name;
    int roll_no;

    //In this program constructor overloading is present

    //non parameterized constructor
    constructor_overloading(){
        System.out.println("hello aman!");
    }

    //parameterized constructor having one argument
    constructor_overloading(String name){
        this.name=name;
        System.out.println(name);
    }

    //parameterized constructor having two argument
    constructor_overloading(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
        System.out.println(name+" "+roll_no);
    }

    public static void main(String[] args) {
        constructor_overloading obj1=new constructor_overloading();
        constructor_overloading obj2=new constructor_overloading("aman");
        constructor_overloading obj3=new constructor_overloading("rohit",420);
    }    
}
