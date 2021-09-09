package incedo.lata.core.collections;

import java.util.Comparator;

import P1.Employee;

public class IdComp implements Comparator<Employee> {

	/*@Override
	public int compare(Object arg0, Object arg1) {
		Employee emp1=(Employee)arg0;
		Employee emp2=(Employee)arg1;
		return emp1.getEmpId()-emp2.getEmpId();
	}
*/
	@Override
	public int compare(Employee arg0, Employee arg1) {
		return arg0.getEmpId()-arg1.getEmpId();
	}

}
