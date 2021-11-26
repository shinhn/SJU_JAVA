package object;

public class HashCodeTest { 
	
   public static void main(String[] args) { 
      Object obj = new Object(); 
       
      System.out.println(obj); 				//obj 객체의 주소값(Reference Address)을 출력
       
      System.out.println(obj.hashCode()); 	//obj 객체의 고유한 hashcode를 출력
       
      System.out.println(Integer.toHexString(obj.hashCode())); //obj 객체의 hashcode를 16진수로 출력
   } 
} 





