package DesignPattern.Proxy.ex1;

import java.util.List;

public class StudentServiceImpl implements StudentService {

	@Override
	public boolean delete(Student stu) {
		System.out.println("delete(Student stu)");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Student stu) {
		System.out.println("add(Student stu)");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean query(int id) {
		System.out.println(" query(int id)");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> queryAll() {
		System.out.println("List<Student> queryAll()");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> query(String name) {
		System.out.println("List<Student> query(String name)");
		// TODO Auto-generated method stub
		return null;
	}

}
