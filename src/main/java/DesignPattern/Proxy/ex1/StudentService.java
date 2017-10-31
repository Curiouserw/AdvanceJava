package DesignPattern.Proxy.ex1;

import java.util.List;

public interface StudentService {
	boolean delete(Student stu);
	boolean add(Student stu);
	boolean query(int id);
	List<Student> queryAll();
	List<Student> query(String name);
	
}
