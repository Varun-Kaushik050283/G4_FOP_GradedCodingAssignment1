/**
 * Department package having all the necessary department classes to be used in the project
 */
package fsd.fop.assignment1.department;

import fsd.fop.assignment1.collection.Constants;
import fsd.fop.assignment1.department.generic.SuperDepartment;

/**
 * HrDepartment class will contain 4 methods of return type String and will not
 * accept any parameter.
 * 
 * @author Varun Kaushik
 */
public final class HrDepartment extends SuperDepartment {

	public String departmentName() {
		return Constants.HR_DEPARTMENT_NAME;
	}
	
	public String getTodaysWork() {
		return Constants.HR_TODAYS_WORK;
	}

	public String getWorkDeadline() {
		return Constants.HR_WORK_DEADLINE;
	}

	public final String doActivity() {
		return Constants.HR_DO_ACTIVITY;
	}
}
