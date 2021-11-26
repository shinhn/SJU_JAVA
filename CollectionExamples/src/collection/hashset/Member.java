package collection.hashset;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// equals 메소드를 오버라이딩
	// 인스턴스가 달라도 이름과 나이가 동일하다면 동일한 객체로 간주하여
	// 중복 저장되지 않도록 하기 위함
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age) ;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return name.hashCode() + age;
	}
}



