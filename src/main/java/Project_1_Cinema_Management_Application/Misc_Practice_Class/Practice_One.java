package Project_1_Cinema_Management_Application.Misc_Practice_Class;

public class Practice_One {

    private String name;
    private int id;
    private long salary;

    public Practice_One(int id, String name, long salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}

class driver{
    public static void main(String[] args) {
        Practice_One obj1 = new Practice_One(1, "sam", 1000);
        Practice_One obj2 = new Practice_One(1, "sam", 1000);

        System.out.println(obj1.equals(obj2));
    }
}
