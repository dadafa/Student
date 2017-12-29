/**
 * 
 */
package com.xyd.stu;

import java.util.Scanner;

/**
 * @author scott
 * @date 2017年12月26日下午4:45:20
 * @version 
 * @description 
 */
public class StuClient {

	public static void main(String[] args) {
		
		ManagerStu managerStu = new ManagerStu();
		
		//添加学生
		managerStu.addStu(inputStu());
		
//		managerStu.update("aa", inputStu());
		
		//打印
		managerStu.showAll();
	}

	/**
	 * 键盘输入一个学生
	 */
	private static Student inputStu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入学生姓名?");
		String name = sc.next();
		
		System.out.println("请输入学生年龄?");
		int age = sc.nextInt();
		
		System.out.println("请输入学生id?");
		int id = sc.nextInt();
		System.out.println("请输入学生分数?");
		int score = sc.nextInt();
		return new Student(id, name, age, score);
	}
}
