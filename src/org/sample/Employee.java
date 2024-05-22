package org.sample;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Employee {
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.setId(152);
		s.setName("Mani");
		s.setPhNo(787541518l);
		
		Sample s2 = new Sample();
		s2.setId(454);
		s2.setName("rani");
		s2.setPhNo(986494449l);
		
		List<Sample> l = new LinkedList<>();
		
		l.add(s);
		l.add(s2);
		l.add(s);
	
		for (int i = 0; i < l.size(); i++) {
			
			System.out.println("Employee details "+ (i+1));
			System.out.println("Emplyoee Id: "+ l.get(i).getId());
			System.out.println("Employee Name: "+ l.get(i).getName());
			System.out.println("Employee Phno: "+ l.get(i).getPhNo());
			
			
		}
		

		System.out.println("<<<<<<<<<>>>>>>>");
		
		
		Set<Sample>l1 = new HashSet<>();
		
		l1.add(s);
		l1.add(s2);
		l1.add(s);
		
		for (Sample sa: l1) {
			
			System.out.println("employeeid: "+sa.getId() );
			System.out.println("employeeName: "+sa.getName() );
			System.out.println("employeePhno: "+sa.getPhNo() );
			
<<<<<<< HEAD
			System.out.println("not entered");
=======
			System.out.println("overed");
>>>>>>> 3fbdb4a42a422f3e8a18719210fc4ebbee7e8137
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
