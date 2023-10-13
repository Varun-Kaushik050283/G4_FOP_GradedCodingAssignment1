/**
 * Department package having all the necessary department classes to be used in the project
 */
package fsd.fop.assignment1.department;

import fsd.fop.assignment1.collection.Constants;
import fsd.fop.assignment1.department.generic.SuperDepartment;

/**
 * AdminDepartment class will contain 3 methods of return type String and will
 * not accept any parameter.
 * 
 * @author Varun Kaushik
 */
public final class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		return Constants.ADMIN_DEPARTMENT_NAME;
	}

	public String getTodaysWork() {
		return Constants.ADMIN_TODAYS_WORK;
	}

	public String getWorkDeadline() {
		return Constants.ADMIN_WORK_DEADLINE;
	}

}
