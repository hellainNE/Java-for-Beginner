import java.util.Scanner;

public class javaIFStatement {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);


  System.out.println("Enter your age: ");
  int age = scanner.nextInt();
  scanner.nextLine();
  
  if (age>=75){
  System.out.println("You are a Senior Citizen");
  }else if(age>=18){
     System.out.println("You are an adult!");
  }else if(age>=13){
    System.out.println("You are a teenager!");
  }
  else{
    System.out.println("You are a minor");
  }
 } 
}
