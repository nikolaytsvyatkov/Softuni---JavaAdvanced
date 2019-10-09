package DefiningClasses.companyroster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> list;
    public Department(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Employee> getList() {
        return this.list;
    }
}
