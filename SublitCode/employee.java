package SublitCode;
import java.util.*;
public class employee{
    private String name;
    private int age;
    private float salary;

    employee(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void calculateNetSalary(){
        float tax = 0.0f;
        // if(salary<700000.0){
        //     System.out.print(name + " " +tax);
        // }

        if(salary<=300000.0){
            tax = 0.0f;
        }
        else if(salary<=600000)
        {
            tax = 0.05f*(salary-300000f);
        }
        else if(salary<=900000){
            tax = (0.05f*300000.0f) + (0.1f*(salary-600000.0f));
        }
        else if(salary<=1200000){
            tax = (0.05f*300000.0f) + (0.1f*300000.0f) + (0.15f*(salary-900000.0f));
        }
        else if(salary<=1500000){
            tax = (0.05f*300000.0f) + (0.1f*300000.0f) + (0.15f*300000.0f) + (0.2f*(salary-1200000.0f));
        }
        else{
            tax = (0.05f*300000.0f) + (0.1f*300000.0f) + (0.15f*300000.0f) + (0.2f*300000.0f) + (0.3f*(salary-1500000f));
        }

        float netSal = salary-tax;

        if(salary<700000f){
            System.out.println(name + " " +salary);    
        }
        else{
            System.out.println(name + " " +netSal);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        employee employees[] = new employee[n];

        for(int i = 0; i<n; i++){
            String name = sc.next();
            int age = sc.nextInt();
            float salary = sc.nextFloat();
            employees[i] = new employee(name,age,salary);
        }

        for(int i = 0; i<n; i++){
            employees[i].calculateNetSalary();
        }

        sc.close();
    }
}