package assignments.employeestack;

public class FixedStack implements Stack{
    Employee[] emp = new Employee[STACK_SIZE];
    int top = -1;
    @Override
    public void push(Employee e) {
        if(top == STACK_SIZE-1){
            System.out.println("OverFlow");
        }
        else{
            top++;
            emp[top] = e;
        }
    }
    @Override
    public Employee pop() {
        Employee temp = new Employee(0,"",0.0);
        if(top == -1){
            System.out.println("UnderFlow");
        }
        else{
            temp = emp[top--];
        }
        return temp;
    }
    public void display(){
        if(top == -1){
            System.out.println("UnderFlow");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(emp[i].toString());
        }
    }
}
