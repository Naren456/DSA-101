
import java.util.Scanner;

class Mylist{
    int [] list = new int[1];
    int size = 0;
    int len = list.length;
    //ADDING ELEMENT//
    void add(int num){
        if (this.size<this.list.length){
            this.list[this.size]=num;
        }
        else {
            int [] newlist = new int[this.len*2];
            for (int i =0;i<this.list.length;i++){
                newlist[i]=this.list[i];
            }
            newlist[this.size]=num;
            this.size++;
            this.list=newlist;
            
            
        }
    }
    //INSERTING AT INDEX//
    void set(int index ,int num){
      if (index<this.len)
        this.list[index]=num;
    
    }


    //RETURN AT INDEX//
    int get(int index){
      
          return list[index];
    }
}
Class MylistLog{
   String [] log =new String[1]
}

//main//
class Program{
  public static void main(String[] args) {
    Mylist Arraylist = new Mylist();
    Scanner sc =new Scanner(System.in);
    for (int i=0;i<5;i++){
      int num =sc.nextInt();
      Arraylist.add(num);
    }
    for (int i=0;i<5;i++){
      System.out.print(Arraylist.get(i)+" ");
    }
  
    sc.close();
    
  }
}