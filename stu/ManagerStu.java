/**
 * 
 */
package com.xyd.stu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author scott
 * @date 2017年12月26日下午4:34:07
 * @version
 * @description
 */
public class ManagerStu {

	private List<Student> stus = null;
	
	public ManagerStu() {

		if (stus == null) {
			stus = new ArrayList<>();
		}
		stus.add(new Student(1001, "aa", 45, 70));
		stus.add(new Student(1002, "bb", 40, 80));
		stus.add(new Student(1003, "cc", 35, 60));
		DataUtils.write(stus);
	}

	// 1.添加
	public void addStu(Student stu) {

		stus.add(stu);

		DataUtils.write(stus);

	}

	// 2.删除
	public void deleteStu(Student stu) {

	}

	// 3.修改
	/**
	 * 
	 * 查到 要该的学生
	 * 
	 */
	public void update(String name, Student stu) {
		
		stus = DataUtils.readDate();
		int index = findStudent(name);

		if (index != -1) {
			stus.set(index, stu);

			DataUtils.write(stus);

			System.out.println("修改成功");

		} else {
			System.out.println("学生不存在");
		}
	}

	// 4.排序（用学生的分数排序(升序 ,age排序)）

	// 5.打印所有的

	private int findStudent(String name) {

		stus = DataUtils.readDate();
		for (int i = 0; i < stus.size(); i++) {

			Student stu = stus.get(i);

			if (name.equals(stu.getName())) {
				return i;
			}

		}
		// 不存在 这个学生
		return -1;
	}

	public void showAll() {

		List<Student> readDate = DataUtils.readDate();

		for (Student stu : readDate) {
			System.out.println(stu);
		}

	}

	// 6.查询 用id 查询

}
