/**
 * 
 */
package demo02;

/**
 * @author scott
 * @date 2017年12月13日上午10:39:13
 * @version
 * @description
 */
public class StuManager {

	private Student[] stus = new Student[40];

	public StuManager(Student[] stus) {
		this.stus = stus;
	}

	public StuManager() {
	}

	/**
	 * 添加学生 的方法(添加到数组中)
	 * 
	 * 思路: 1.如果数组 的位置为空的(for循环 判断 那个地方 为空)时候 我就添加一个学生
	 * 
	 * 2.添加完毕后 结束方法
	 * 
	 */
	public void addStudent(Student stu) {

		for (int i = 0; i < stus.length; i++) {

			if (stus[i] == null) {

				stus[i] = stu; // 添加完毕后 要结束循环

				break;
			}

		}
		System.out.println("添加成功...");
	}

	/**
	 * 思路: 1.把数组 都封装成 对象 2.调用重载的 addStudent(stu)
	 */
	public void addStudent(String name) {

		Student student = new Student(name);
		this.addStudent(student);
	}

	/**
	 * 思路: 1.把数组 都封装成 对象 2.调用重载的 addStudent(stu)
	 */
	public void addStudent(String name, int age) {

		Student student = new Student(name, age);
		this.addStudent(student);

	}

	/**
	 * 思路： 1.通过 name 找到 学生在数组中的 位置
	 * 
	 * 2.stu 替换 学生所在的位置
	 */
	public void updateStudent(Student stu, String name) {

		int index = selectStuByName(name);

		if (index != -1) {
			// 替换之前那个位置的学生
			stus[index] = stu;
		} else {
			System.out.println("这个学生 不存在 ...");
		}
	}

	/**
	 * 通过 学生的姓名 找到学生 在数组中的位置 思路: 1.循环查找 每个学生 2.如果 学生名字 和 我们 要找的 name 相等 我们就返回 index
	 * 
	 */
	private int selectStuByName(String name) {

		for (int i = 0; i < stus.length; i++) {

			Student stu = stus[i];
			// 字符串 内容判断 用 equals 方法
			if (stu != null && stu.getName().equals(name)) {

				return i;
			}
		}
		return -1;
	}

	/**
	 * 思路: 1.找到这个学生的 在数组中的 位置
	 * 
	 * 2.stus[index] = null;
	 * 
	 */
	public void delete(Student stu) {

		int index = this.selectStuByName(stu.getName());


		if (index != -1) {
			// 替换之前那个位置的学生
			stus[index] = null;
			System.out.println("删除了 ... ");
		} else {
			System.out.println("这个学生 不存在 ...");
		}
		

	}

	/**
	 * 思路: 1.把数据封装成 对象
	 * 
	 * 2.调用重载方法 delete(Student stu)
	 * 
	 */
	public void delete(String name) {

		Student stu = new Student(name);

		this.delete(stu);

	}

	/**
	 * 打印所有的学生信息
	 */
	public void printAllStu() {
		for (int i = 0; i < stus.length; i++) {
			if (stus[i] != null) {

				System.out.println(stus[i]);

			}
		}
	}

}
