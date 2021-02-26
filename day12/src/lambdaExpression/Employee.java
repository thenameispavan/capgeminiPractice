package lambdaExpression;

public class Employee {
private String name;
private Double salary;
private Integer age;
public Employee(String name, Double salary,Integer age) {
	super();
	this.name = name;
	this.salary = salary;
	this.age=age;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String toString() {
	return name+"\t"+salary+"\t"+age;
}
}
