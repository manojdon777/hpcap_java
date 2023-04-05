package assignments.employeestack;

public class GrowableStack implements Stack{
    Employee[] emp = new Employee[STACK_SIZE];
    int counter = -1;

    @Override
    public void push(Employee e) {
        System.out.println(emp.length);
        if(counter != emp.length-1){
            counter++;
            emp[counter] = e;
        }
        else{
            int i;
            Employee[] temp = new Employee[emp.length * 2];
            for (i = 0; i < emp.length; i++) {
                temp[i] = emp[i];
            }
            emp = temp;
        }
    }
    @Override
    public Employee pop() {
        Employee temp = new Employee(0,"",0.0);
        if(counter == -1){
            System.out.println("UnderFlow");
        }
        else{
            temp = emp[counter--];
            System.out.println("Popped");
        }
        return temp;
    }
    public void display(){
        if(counter == -1){
            System.out.println("UnderFlow");
            return;
        }
        for (int i = 0; i <= counter; i++) {
            System.out.println(emp[i].toString());
        }
    }
}
