package incedo.lata.core.collections;

import java.util.Comparator;

import P1.Employee;

public class NameComp implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee emp1=(Employee)arg0;
		Employee emp2=(Employee)arg1;
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}
}
