package lambdaExpression;

//class Sum implements Calculator{
//
//	@Override
//	public int calculate(int a, int b) {
//		// TODO Auto-generated method stub
//		return a+b;
//	}
//	
//}
public class Main {

	public static void main(String[] args) {
//		Sum obj= new Sum();
//		System.out.println(obj.calculate(10,5));
//		Calculator cal=new Calculator() {
//
//			@Override
//			public int calculate(int a, int b) {
//				// TODO Auto-generated method stub
//				return a+b;
//			}
//			
//		};
//		Calculator cal1=new Calculator() {
//
//			@Override
//			public int calculate(int a, int b) {
//				// TODO Auto-generated method stub
//				return a-b;
//			}
//			
//		};
//		System.out.println(cal.calculate(10,15));
//		System.out.println(cal1.calculate(10,15));\
		Calculator cal=(a,b)->{
			System.out.println("addition jaruguthundhi mawa");
			return a+b;
		};
		SayHello s=x->"ela unnav "+x.toUpperCase();
		Sizable size=()->System.out.println("sizable executed");
		Calculator cal1=(a,b)->a-b;
		Calculator cal2=(a,b)->a*b;
		System.out.println(cal.calculate(12, 5));
		System.out.println(cal1.calculate(12, 5));
		System.out.println(cal2.calculate(12, 5));
System.out.println(s.hello("Bhanu"));
size.size();
	}
	

}
