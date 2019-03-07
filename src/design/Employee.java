package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	public int employeeId();
	public String employeeName();
    public void assignDepartment();
	public int calculateSalary();
	public void benefitLayout();
	public default void startUpBonus(){
		System.out.println("Every employee got 5000$ at start up bonus");
	}

	public static void housing(){
		System.out.println("\nDoctors and postdoc got housing near the hospital in a 50% discounted rate");

	}

}
