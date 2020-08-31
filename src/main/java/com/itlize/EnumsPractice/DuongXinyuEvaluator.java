package EnumsAssignment.src.main.java.com.itlize.EnumsPractice;


public class DuongXinyuEvaluator {
	enum name{
		Duong, Xinyu;
	}
	
	
	String input;
	

	
	public DuongXinyuEvaluator(String input) {
		// TODO Auto-generated constructor stub
		this.input = input;
	}
	
	public boolean isDuong() {
		
		//should use equals rather than ==
		return this.input==name.Duong.name() ;
	}
	
	public boolean isXinyu() {
		return this.input == name.Xinyu.name() ;
	}
	
//	public static void main(String[] args) {
//		DuongXinyuEvaluator dE = new DuongXinyuEvaluator("Xinyu");
//		
//		System.out.println(dE.isDuong());
//		System.out.println(dE.isXinyu());
//		System.out.println(name.Duong.toString());
//		System.out.println(dE.input);
//		
//		DuongXinyuEvaluator dE2 = new DuongXinyuEvaluator("yang");
//		System.out.println(dE2.isDuong());
//		System.out.println(dE2.isXinyu());
//		
//		
//		
//	}
}
