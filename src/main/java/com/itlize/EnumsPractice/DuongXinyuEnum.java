package EnumsAssignment.src.main.java.com.itlize.EnumsPractice;

public enum DuongXinyuEnum {

	 Duong, Xinyu;

	//enum got own name()
//	public final String name() {
//		return this.toString();
//	}
	
	public String getCatchPhrase(){
		return "Hey, my name is "+this.toString()+"!" ;
//		"Hey, my name is Duong!"
	}
	
	public boolean isDuong() {
		return this == Duong;
	}
	
	public boolean isXinyu() {
		return this == Xinyu;
	}
	
//	public static void main(String[] args) {
//		DuongXinyuEnum d = DuongXinyuEnum.Duong;
//		System.out.println(d.name());
//		
//		System.out.println(d.getCatchPhrase());
//		
//		System.out.println(d.isDuong());
//		
//		System.out.println(d.isXinyu());
//	}
}
