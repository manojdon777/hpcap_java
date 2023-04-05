package assignments.employeestack;

public class TestStackImplementation {
    public static void main(String[] args) {
        Employee e;
        FixedStack fixedStack = new FixedStack();
        GrowableStack growableStack = new GrowableStack();
//        System.out.println(fixedStack.pop());
//        fixedStack.push(new Employee(101, "AAA", 50000));
//        fixedStack.push(new Employee(102, "BBB", 80000));
//        fixedStack.push(new Employee(103, "BBB", 80000));
//        fixedStack.push(new Employee(104, "BBB", 80000));
//        fixedStack.push(new Employee(105, "BBB", 80000));
//        fixedStack.push(new Employee(106, "BBB", 80000));
//        System.out.println(fixedStack.pop());
//        System.out.println(fixedStack.pop());

        System.out.println(fixedStack.pop());
        growableStack.push(new Employee(101, "AAA", 51000));
        growableStack.push(new Employee(102, "BBB", 52000));
        growableStack.push(new Employee(103, "CCC", 53000));
        growableStack.push(new Employee(104, "DDD", 54000));
        growableStack.push(new Employee(105, "EEE", 55000));
        growableStack.push(new Employee(106, "FFF", 56000));
        growableStack.push(new Employee(107, "GGG", 57000));
        growableStack.push(new Employee(108, "HHH", 58000));
        growableStack.push(new Employee(109, "III", 59000));
        growableStack.push(new Employee(110, "JJJ", 51100));
//        growableStack.display();
//        System.out.println(growableStack.pop());





//        fixedStack.display();
    }
}
/*
Create Java application for fixed stack & growable stack based on Stack i/f , for storing emp details

Steps
1.1  Create Employee class -- id,name,salary, constructor,toString
1.2 Stack interface -- push & pop functionality for Emp refs. & declare STACK_SIZE as a constant.
1.3 Create implementation class of Stack i/f -- FixedStack (array based)
1.4 Create another implementation class of Stack i/f-- GrowableStack (array based)

1.5

From Tester class (Hint :  use dynamic method dispatch using interfaces)
--- display Menu
(Note : Must use 1 switch-case only. You won't need any complex nested control structure
Once user selects either fixed or growable stack , user shouldn't be allowed to change the selection of the stack.(Hint : null checking)
)
1 -- Choose Fixed Stack
2 -- Choose Growable Stack
Accept following options only after initial selection.(Hint : null checking)
3 -- Push data
I/P Accept emp details & store these details in the earlier chosen stack
4 --- Pop data & display the same (from the earlier chosen stack)
5 -- Exit
*/
