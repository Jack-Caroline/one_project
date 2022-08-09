package com.jack.java.day07.v2;

public class Tester {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Docker docker = new Docker();
        Teacher teacher = new Teacher();
        cooker.showDairly();
        System.out.println("------------------");
        docker.showDairly();
        System.out.println("------------------");
        teacher.showDairly();
    }
}
