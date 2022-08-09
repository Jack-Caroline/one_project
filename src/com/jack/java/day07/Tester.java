package com.jack.java.day07;

public class Tester {
    public void showWork(Worker worker) {
        worker.work();
    }

    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Teacher teacher = new Teacher();
        Docker docker = new Docker();
        Tester tester = new Tester();
        tester.showWork(cooker);
        tester.showWork(teacher);
        tester.showWork(docker);
    }
}
