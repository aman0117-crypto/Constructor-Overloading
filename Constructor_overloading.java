package Polymorphism.Compile_time;

public class Constructor_overloading {

    int a;
    String name;
    float f;

    public Constructor_overloading(){
        System.out.println("This is a no arg constructor..");
    }

    public Constructor_overloading(int a){
        this.a=a;
        System.out.println(a);
    }

    public Constructor_overloading(String name,float f){
        this.name=name;
        this.f=f;
        System.out.println(name);
        System.out.println(f);
    }

    public static void main(String[] args) {
        Constructor_overloading c1=new Constructor_overloading();
        Constructor_overloading c2=new Constructor_overloading(5);
        Constructor_overloading c3=new Constructor_overloading("aman", 5.5f); 
    }
    
}
