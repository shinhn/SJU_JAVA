package object;

public class HashCodeTest { 
	
   public static void main(String[] args) { 
      Object obj = new Object(); 
       
      System.out.println(obj); 				//obj ��ü�� �ּҰ�(Reference Address)�� ���
       
      System.out.println(obj.hashCode()); 	//obj ��ü�� ������ hashcode�� ���
       
      System.out.println(Integer.toHexString(obj.hashCode())); //obj ��ü�� hashcode�� 16������ ���
   } 
} 





