public class a3 {
    Integer salary;
    int EmpId;
    String EmpName;

    void display() {
        System.out.println(EmpId);
        System.out.println(EmpName);
        System.out.println(salary);
    }

    public static void main(String args[]) {
        a3 object = new a3();
        object.display();
    }
}