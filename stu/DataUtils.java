/**
 * 
 */
package com.xyd.stu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * @author scott
 * @date 2017年12月26日下午4:37:12
 * @version
 * @description
 */
public class DataUtils {

	/**
	 * 往文件中写入数据
	 */
	public static void write(List list) {

		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("src/obj.txt")));
			oos.writeObject(list);

			oos.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	/*
	 * 读取数据 
	 */
	public static List<Student> readDate() {
		ObjectInputStream oos = null;
		try {
			oos = new ObjectInputStream(new FileInputStream(new File("src/obj.txt")));
			Object obj = oos.readObject();

			if (obj  != null && obj instanceof List) {
				return (List<Student>) obj;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
