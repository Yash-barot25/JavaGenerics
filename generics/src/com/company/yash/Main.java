package com.company.yash;

public class Main {



    public static void main(String[] args) {

        ComputerStudent yash = new ComputerStudent("yashu");
        ComputerStudent yash1 = new ComputerStudent("yashu1");
        MechanicalStudent parth = new MechanicalStudent("Parthu");
        ElectricalStudent dipesh = new ElectricalStudent("Dipu");


        Department<ComputerStudent> computerDepartment = new Department<>("Sheridan Computer");
        computerDepartment.addStudents(yash);
        computerDepartment.addStudents(yash1);
        System.out.println(computerDepartment.getName() + " has " +computerDepartment.departmentSize() + " Students in it");
        Department<MechanicalStudent> mechanicalDepartment = new Department<>("Sheridan mechanical");
        mechanicalDepartment.addStudents(parth);
        System.out.println(mechanicalDepartment.getName() + " has " +mechanicalDepartment.departmentSize() + " Students in it");
        Department<ElectricalStudent> electricalrDepartment = new Department<>("Sheridan electrical");
        electricalrDepartment.addStudents(dipesh);
        System.out.println(electricalrDepartment.getName() + " has " +electricalrDepartment.departmentSize() + " Students in it");

        int winner;
       winner =  electricalrDepartment.compareTo(computerDepartment);
        System.out.println(winner > 0 ? "computer won" : winner < 0 ? "electrical won" : "tie");
    }


}
