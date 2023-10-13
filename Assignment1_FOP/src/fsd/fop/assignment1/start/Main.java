/**
 * 
 */
package fsd.fop.assignment1.start;

import fsd.fop.assignment1.department.AdminDepartment;
import fsd.fop.assignment1.department.HrDepartment;
import fsd.fop.assignment1.department.TechDepartment;

/**
 * 
 */
public final class Main {
  
	public static void main(String[] args) {
		/**
		 * 1. Admin Department
		 */
		AdminDepartment adminDepartment = new AdminDepartment();
		System.out.println("Welcome to "+adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println();
		
		/**
		 * 2. HR Department
		 */
		HrDepartment hrDepartment = new HrDepartment();
		System.out.println("Welcome to "+hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());		
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println();
				
		/**
		 * 3. Tech Department
		 */
	    TechDepartment techDepartment = new TechDepartment();
		System.out.println("Welcome to "+techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		
		
	}
}
