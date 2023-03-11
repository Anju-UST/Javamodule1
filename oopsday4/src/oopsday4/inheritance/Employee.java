package oopsday4.inheritance;

public class Employee extends Person {
	
	private long empid;
	private String deptno;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String gender, int age,long empid, String deptno, double salary) {
		
		super(name, gender, age);
		this.empid=empid;
		this.deptno=deptno;
		this.salary=salary;
		
		
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptno == null) ? 0 : deptno.hashCode());
		result = prime * result + (int) (empid ^ (empid >>> 32));
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (deptno == null) {
			if (other.deptno != null)
				return false;
		} else if (!deptno.equals(other.deptno))
			return false;
		if (empid != other.empid)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	/*public boolean equals(Object obj) {*/
		// TODO Auto-generated method stub
		
		/*Employee ref= null;
		if(obj!= null)
			ref=(Employee) obj;
		
		if(this.empid == this.empid &&
				this.getName().equals(ref.getName()) &&
				this.deptno == ref.deptno)
			return true;
		else
			return false;
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int code=this.hashCode() * 
				32 * 
				((int)this.empid) * 
				(this.getName().length())* 
				this.deptno.length();
		
				return super.hashCode();
	}*/


}
