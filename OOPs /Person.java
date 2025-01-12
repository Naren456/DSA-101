public class Person{
  private String name;
  private int age;
  Person(String name,int age){
    this.name = name;
    this.age = age;
  }
   String GetName(){
    return name;
   }
 int GetAge(){
    return age;
   }
   void SetAge(int age){
         this.age = age;
   }
   void SetName(String name){
    this.name = name;
   }
}