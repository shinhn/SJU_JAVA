/*class Car {
   int speed = 0;

   void upSpeed(int speed) {
      this.speed += speed;
      System.out.println("현재속도(슈퍼클래스) : " + this.speed);
   }
}

class Sedan extends Car {
	// Sedan 클래스에서 upSpeed( )를 오버라이딩함(재정의)
	// 최고 속도가 150이상 안되도록 설정함	
   void upSpeed(int speed) {
	  super.upSpeed(speed);
      this.speed += speed;
      if (this.speed > 150)
         this.speed = 150;
      System.out.println("현재속도(서브클래스) : " + this.speed);
   }
}

class Truck extends Car {
}

public class Ex12_06 {
   public static void main(String[] args) {

      Truck truck1 = new Truck();
      Sedan sedan1 = new Sedan();

      System.out.print("트럭 --> ");
      truck1.upSpeed(200);
      
      System.out.print("승용차 --> ");
      sedan1.upSpeed(200);
   }
}

*/