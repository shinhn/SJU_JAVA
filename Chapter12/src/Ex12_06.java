/*class Car {
   int speed = 0;

   void upSpeed(int speed) {
      this.speed += speed;
      System.out.println("����ӵ�(����Ŭ����) : " + this.speed);
   }
}

class Sedan extends Car {
	// Sedan Ŭ�������� upSpeed( )�� �������̵���(������)
	// �ְ� �ӵ��� 150�̻� �ȵǵ��� ������	
   void upSpeed(int speed) {
	  super.upSpeed(speed);
      this.speed += speed;
      if (this.speed > 150)
         this.speed = 150;
      System.out.println("����ӵ�(����Ŭ����) : " + this.speed);
   }
}

class Truck extends Car {
}

public class Ex12_06 {
   public static void main(String[] args) {

      Truck truck1 = new Truck();
      Sedan sedan1 = new Sedan();

      System.out.print("Ʈ�� --> ");
      truck1.upSpeed(200);
      
      System.out.print("�¿��� --> ");
      sedan1.upSpeed(200);
   }
}

*/