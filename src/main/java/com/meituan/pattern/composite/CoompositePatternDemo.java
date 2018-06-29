package com.meituan.pattern.composite;

public class CoompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO",300000);
        Employee headSales = new Employee("Rebort","Head Sales",20000);
        Employee headMarketing = new Employee("Michel","Head MArketing",199999);
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);
        for(Employee headEmployee: CEO.getSudordinates()){
            System.out.println(headEmployee);
            for(Employee employee:headEmployee.getSudordinates()){
                System.out.println(employee);
            }
        }
    }
}
