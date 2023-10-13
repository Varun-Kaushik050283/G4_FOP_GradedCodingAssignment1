/**
 * Department package having all the necessary department classes to be used in the project
 */
package fsd.fop.assignment1.department;

import fsd.fop.assignment1.collection.Constants;
import fsd.fop.assignment1.department.generic.SuperDepartment;

/** Tech department will contain 4 methods of return type String and will not accept any
 * parameter.
 * 
 * @author Varun Kaushik
 */
public final class TechDepartment extends SuperDepartment {

	public String departmentName() {
		return Constants.TECH_DEPARTMENT_NAME;
	}

	public String getTodaysWork() {
		return Constants.TECH_TODAYS_WORK;
	}

	public String getWorkDeadline() {
		return Constants.TECH_WORK_DEADLINE;
	}

	public final String getTechStackInformation() {
		return Constants.TECH_STACK_INFORMATION;
	}
}
