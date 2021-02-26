package lambdaExpression;

@FunctionalInterface
public interface Calculator {
	int calculate(int a,int b);
}
@FunctionalInterface
interface SayHello{
	String hello(String name);
}
interface Sizable{
	void size();
}
