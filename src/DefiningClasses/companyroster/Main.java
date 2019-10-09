package DefiningClasses.companyroster;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        Department maxSalaray = null;
        double salaryMAx = 0;
        Map<String, Department> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] strings = input.nextLine().split(" ");
            Employee employee = null;
            if (strings.length == 4) {
                employee = new Employee(strings[0], Double.parseDouble(strings[1]), strings[2], strings[3]);
            } else if (strings.length == 5) {
                if (strings[4].contains("@")) {
                     employee = new Employee(strings[0], Double.parseDouble(strings[1]), strings[2], strings[3], strings[4]);
                } else {
                     employee = new Employee(strings[0], Double.parseDouble(strings[1]), strings[2], strings[3], Integer.parseInt(strings[4]));
                }
            } else if (strings.length == 6) {
                String name = strings[0];
                double salary = Double.parseDouble(strings[1]);
                String position = strings[2];
                String depeartment = strings[3];
                String email = strings[4];
                int age = Integer.parseInt(strings[5]);
                 employee = new Employee(strings[0], Double.parseDouble(strings[1]), strings[2], strings[3],strings[4], Integer.parseInt(strings[5]));
            }
            if (!map.containsKey(strings[3])) {
                Department department = new Department(strings[3]);
                List<Employee> list = department.getList();
                list.add(employee);
                map.put(strings[3],department);
            } else {
                List<Employee> list = map.get(strings[3]).getList();
                list.add(employee);

            }



        }
          for (Map.Entry<String, Department> entry : map.entrySet()) {
            List<Employee> list = entry.getValue().getList();
            double current = 0;
            for (Employee j : list) {
                current += j.getSalary();
            }
            if (current > salaryMAx) {
                salaryMAx = current;
                maxSalaray = entry.getValue();
            }
        }
        System.out.println();
        System.out.printf("Highest Average Salary: %s%n",maxSalaray.getName());
        maxSalaray.getList().stream().sorted((a, b) -> {
            return Double.compare(b.getSalary(), a.getSalary());
        }).forEach(e -> {
            System.out.printf("%s %.2f %s %d%n", e.getName(), e.getSalary(), e.getEmail(), e.getAge());
        });
    }
}
