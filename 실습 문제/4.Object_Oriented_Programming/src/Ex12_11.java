// 다중상속 
// java는 다중상속을 허용하지 않으므로 인터페이스 사용 

interface Car11{
	abstract void work();
}

interface Cannon{
	abstract void fire();
}

class Tank implements Car11, Cannon{
	public void work() {
		System.out.println("탱크는 차이다. ");
	}
	public void fire() {
		System.out.println("탱크는 대포다. ");
	}
}

public class Ex12_11 {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.work();
		tank.fire();

	}

}
