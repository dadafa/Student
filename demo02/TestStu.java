/**
 * 
 */
package demo02;

import java.util.Scanner;

/**
 * @author scott
 * @date 2017年12月13日上午11:08:53
 * @version 
 * @description 
 * 
 *   请输入 你操作的 选择
              1.添加学生
              
              2.删除学习
              
              3.修改
              
              4.查看  
 */
public class TestStu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//创建对象 
		StuManager stuManager = new StuManager();
		
		System.out.println("添加学生 ... ");
		
		stuManager.addStudent("aa");
		stuManager.addStudent(new Student("郭美美", 30));
		stuManager.addStudent("马化腾",40);

		stuManager.printAllStu();
		
		System.out.println("修改学生");
		
		stuManager.updateStudent(new Student("乔帮主", 44), "cc");
		
		stuManager.printAllStu();
		
		System.out.println("删除学生*************");
		
		System.out.println("请输入要删除的 学生的名字 ？ ");
		String name = sc.next();
		stuManager.delete(name);
		stuManager.printAllStu();
		
	}
}
