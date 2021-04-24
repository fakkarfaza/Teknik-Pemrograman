package Employee_And_Manager;
	
	abstract class Sortable {
		public abstract int compare(Sortable b);
		
		public static void shell_sort(Sortable[] a) {
			int n = a.length;
			for (int gap = n/2; gap > 0; gap /= 2)
			{
				for (int i = gap; i < n; i += 1)
				{
					Sortable temp = a[i];
					int j;
					for (j = i; j >= gap && a[j - gap].compare(temp) < 0; j -= gap)
						a[j] = a[j - gap];
					a[j] = temp;
				}
			}     
		}
	}

	public class Employee extends Sortable{
		private String name;
		private double salary;
		private int hireday;
		private int hiremonth;
		private int hireyear;
		
		public Employee(String name, double salary, int hireday, int hiremonth, int hireyear) {
			this.name = name;
			this.salary = salary;
			this.hireday = hireday;
			this.hiremonth = hiremonth;
			this.hireyear = hireyear;
		}
		
		public void print() {
			System.out.println(name + " " + salary + " " + hireYear());
		}
		
		public void raiseSalary(double byPercent) {
			salary *= 1 + byPercent / 100;
		}
		
		public int hireYear() {
			return hireyear;
		}
		
		/* When Sortable extended to Employee class, 
		 * the method compare will be implemented.
		 */
		public int compare(Sortable b) {
			Employee eb = (Employee) b;
			if (salary<eb.salary) return -1;
			if (salary>eb.salary) return +1;
			return 0;
		}
	}

