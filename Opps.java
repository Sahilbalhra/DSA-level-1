// class Pen {
//     String color;
//     String type;

//     // function inside a class are method
//     public void write() {
//         System.out.println("writing something");

//     }

//     public void printcolor() {
//         System.out.println(this.color);
//     }

// }

// class Student {
// String name;
// int age;

// public void printInfo() {
// System.out.println(this.name);
// System.out.println(this.age);
// }

// // 1constructor
// // Student() {
// // System.out.println("hello i am constructor");
// // }
// // 2 type of constructor
// Student(String name,int age){
// this.name=name;
// this.age=age;

// }

// //3 copy constructor used copy one object to another
// Student(Student s2){
// this.name=s2.name;
// this.age=s2.age;

// }

// Student() {

// }

// }

// polymorphism

// class Student {
//     int age;
//     String name;

//     public void printInfo(String name) {
//         System.out.println(name);
//     }

//     public void printInfo(int age) {
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age) {
//         System.out.println(name + " age is :" + age);
//     }
// }





// //base class super class parent class
// class Shapes{
//     public void area(){
//         System.out.println("displays area");

//     }
// }

// //sub class child class
// class Triangle extends Shapes{
//     public void area(int l,int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class EquilateralTriangle extends Shapes{
//     public void area(int l,int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class Circle extends Shapes{
//     public void area(int r){
//         System.out.println((3.14)*r*r);
//     }
// }


public class Opps {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();
        // pen1.printcolor();

        // Student() are the constructor;
        // constructor name should be same as of class name
        // constructor does not have return type
        // they allways run first
        // Student std = new Student();
        // std.age = 20;
        // std.name = "Sahil";
        // std.printInfo();

        // 3 Types of constructor are
        // 1 constructor without parameter
        // 2 with parameter
        // 3 copy constructor

        // Student std2 = new Student("Aman",34);
        // std2.printInfo();

        // Student s1=new Student();
        // s1.name="amit";
        // s1.age=34;
        // Student s2=new Student(s1);
        // s2.printInfo();

        //concept of oops 4

        // 1)polymorphism
        // Types of Polymorphisms are:
        // 1)Method overriding:

        // 2)method Overloading(run time error)

        // Student s1 = new Student();
        // s1.age = 22;
        // s1.name = "Sahil";
        // overLoading(compil time error )
        // s1.printInfo(s1.age);
        // s1.printInfo(s1.name);
        // s1.printInfo(s1.name,s1.age);


        //2)Inhirtance( ak class ki properties use by another class) used for code reuseablety
        // Triangle t1=new Triangle();

        //types of Inhirtance
        //1) single level inhertance(shape and triangle)
        //2) multi level inhertance(shape and triangle and equilateral triangle)
        //3) herierchical (shapse and then triangle and circle)
        //4) hybrid (mix of other types inhritance)



        //pakage(collection of related classes and interface)


    }

}
