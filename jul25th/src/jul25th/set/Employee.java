package jul25th.set;

public class Employee implements Comparable<Employee> {
	int id;
	String name,desig;
	
	public Employee(int id, String name, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name +", desig=" + desig + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
}
