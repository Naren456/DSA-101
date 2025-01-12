public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Adam",12);
        Person person2 = new Person("Even",14);
        System.out.println(person1.GetAge()+" is"+person1.GetName());
    }
}
