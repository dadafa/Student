/**
 * 
 */
package demo02;

/**
 * @author scott
 * @date 2017年12月13日上午10:36:39
 * @version
 * @description
 */
public class Student {

	private String name;

	private int age;

	// 如果为 n 为男 !n 为女
	private char sex;

	/**
	 * 一个参数的构造器
	 */
	public Student(String name) {
		this.name = name;
	}
	
	/**
	 * 2 个参数的构造器 
	 */
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + (sex == 'n' ? "男" : "女") + "]";
	}

}
