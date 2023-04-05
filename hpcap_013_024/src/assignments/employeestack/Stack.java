package assignments.employeestack;

public interface Stack {
    int STACK_SIZE = 5;
    void push(Employee e);
    Employee pop();
}
