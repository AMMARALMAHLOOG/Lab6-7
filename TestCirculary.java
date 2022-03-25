package newsimple;

import java.util.Scanner;


public class TestCirculary {

  public static void main(String[] args) {
  
  CircularyLinkedList<String>list=new CircularyLinkedList<>();
  Scanner in=new Scanner(System.in);
  
  System.out.println("operations of circulary linked list \n"+"1 add first \t2 add last \t3 rotate \t remove first \n 0 exit");
  int choice=-1;
  while (choice!=0){
    System.out.println("your choice: ");
    choice=in.nextInt();
    switch (choice){
      case 1:
      System.out.println("input element");
      list.addFirst(in.next());
      System.out.println("firt element= "+list.first()+"\t last element= "+list.last()+"\t size= "list.size()+"\n\n");break ;
      case 2:
      System.out.println("input element");
      list.addLast(in.next());
      System.out.println("firt element= "+list.first()+"\t last element= "+list.last()+"\t size= "list.size()+"\n\n");break ;
      case 3:
      list.rotate();
      System.out.println("after rotate firt element= "+list.first()+"\t last element= "+list.last()+"\t size= "list.size()+"\n\n");break ;
      case 4:
      System.out.println("removed element is "list.removeFirst());
      System.out.println("firt element= "+list.first()+"\t last element= "+list.last()+"\t size= "list.size()+"\n\n");break ;
        
       case 0:
       System.exit(0);
      
      
    }
  }

  }

}
