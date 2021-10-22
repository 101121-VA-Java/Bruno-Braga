package com.revature.models;	/*  Package in Java is a mechanism to encapsulate a group of
								 *	classes, sub packages and interfaces. 								*
								 *	Packages are used for: Preventing naming conflicts.
								 *
								 */


import java.time.LocalDate;	/*  import is a Java keyword. It declares a Java class to use
							 *	in the code below the import statement. Once a Java class 
							 *	is declared, then the class name can be used in the code 
							 *	without specifying the package the class belongs to. 
							 *  Use the '*' character to declare all the classes belonging to the package.
							 *
							 */


public class Task {   		/*	Class declaration name and give to it public as access modifier
							*
							*	public: The public access modifier is specified using the keyword public.
							*	The public access modifier has the widest scope among all other access modifiers.
							*	Classes, methods, or data members that are declared as public are accessible
							*	from everywhere in the program. 
							*/
	
	
	
	private String name;   /*	It creates a variable named name type String and in this context
							*	is refereed as an field of the class.
							*
							*	Private: The private access modifier is specified using the keyword private. 
							*	The methods or data members declared as private are accessible only within
							*	the class in which they are declared. Any other class of the same package will
							*	not be able to access these members.
							*
							*/
	
	
	
	private LocalDate dueDate;	/*	It creates a private variable(field) called dueDate
								 *	
								 *
								 *
								 *
								 */
	
	public Task() {
		super();
/*
 * 		super.toString(); // in this case, super refers to the parent (Object class) 
 * 							therefore super.toString(); calls the Object class' implementation of the toString() 
 * 							method rather than the implementation of the current class 
 */
		// TODO Auto-generated constructor stub
	}

	public Task(String name, LocalDate dueDate) {
		super();
		this.name = name;
		this.dueDate = dueDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", dueDate=" + dueDate + "]";
	}
	
	public Task getATask() {
		return new Task();
	}
	/*
	 * public class Object{
	 * 	public String toString(){
	 * 		return //memory address; 
	 * }
	 */
}
