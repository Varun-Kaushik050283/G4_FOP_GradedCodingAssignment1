/**
 * Generic package for department package
 */
package fsd.fop.assignment1.department.generic;

import fsd.fop.assignment1.collection.Constants;

/**
 * SuperDepartment class will be the superclass and all other departments must
 * extend it. Super department will contain 4 methods of return type String and
 * will not accept any parameter
 * 
 * @author Varun Kaushik
 */
public abstract class SuperDepartment {

	public String departmentName() {
		return Constants.SUPER_DEPARTMENT_NAME;
	}

	public String getTodaysWork() {
		return Constants.SUPER_TODAYS_WORK;
	}

	public String getWorkDeadline() {
		return Constants.SUPER_WORK_DEADLINE;
	}

	public String isTodayAHoliday() {
		return Constants.SUPER_TODAY_A_HOLIDAY;
	}

}
