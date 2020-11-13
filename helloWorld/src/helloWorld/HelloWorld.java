package helloWorld;

public class HelloWorld {
     public static void main(String[] args) {
     System.out.println("My name is" + " "+ name);
     name = "송혜원";
     System.out.println("My name is" + " "+ name);
     int age = 20;
     System.out.println("My age is" + " " + age);
     age = 28;
     System.out.println("My age is" + " " + age);
     int height = 159;
     System.out.println("나의 키는" + " " + height + "cm 입니다.");		 
     double height = 159.9;
     System.out.println(name + "의 키는 " + height + "cm 입니다."); 
     
     String name1 = "추호연";
     int age1 = 22;
     double height1 = 170.8;
     System.out.println("나와 너의 키를 합친 것은 "+ ("double height" + "double height1") + "입니다." );
      
     System.out.println("나의 이름은 " + name1 + " 입니다. " + "나의 나이는 " + age1  + "살 입니다. "+ "나의 키는 " + height1 + "cm 입니다.");
     System.out.println("두 사람 나이의 합은 " + (age + age1) );
     System.out.println("너의 이름은 무엇이니?");     
     }
}
    