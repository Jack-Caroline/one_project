package com.jack.java.day08;

/*
    1、定义学生类：Student
    2、创建学生1，学生 name：张三，age：25，性别：gender：男
    3、创建学生2，学生 name：李四，age：26，性别：gender：男
    4、创建学生3，学生 name：小花，age：27，性别：gender：女
    5、往这个 list 对象中添加三个学生对象
    6、删除第三个学生对象
    7、取出第一个学生，将姓名 name 改为 王五
    8、通过三种循环方式取出 list 集合里面的所有学生数据，打印 name、age、gender 属性；
 */
/*
    1、两个班级，一个是 1801班，一个是 1802班；
    1801班级有三个学生：studentA、studentB、studentC；
    1802班级有三个学生：studentD、studentE；
    studentA: name=张三，age=25，gender=男；
    studentB: name=李四，age=26，gender=男；
    studentC: name=小花，age=27，gender=女；
    studentD: name=小明，age=28，gender=男；
    studentE: name=小红，age=29，gender=女；
    用 map 保存好两个班级的学生数据，每个班级底下保存对应的学生信息，思考 map 键和值应该用什么类型；
    2、通过两种循环遍历 map 集合取出每个班级底下的学员数据，并输出；
 */


import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        HomeWork homework = new HomeWork();
        homework.test2();
    }

    public void test1() {
        Student student1 = new Student("张三", 25, "男");
        Student student2 = new Student("李四", 26, "男");
        Student student3 = new Student("小花", 27, "女");
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
//        list.remove(2);
        list.remove(student3);
        list.get(0).setName("王五");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge() + " 性别：" + student.getGender());
        }
        // 增强for循环
        for (Student student : list) {
            System.out.println(student);
        }
        // 迭代器
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }

    public void test2() {
        Map<String, ArrayList<Student>> map = new HashMap<String, ArrayList<Student>>();
        Student studentA = new Student("张三", 25, "男");
        Student studentB = new Student("李四", 26, "男");
        Student studentC = new Student("小花", 27, "女");
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(studentA);
        list.add(studentB);
        list.add(studentC);
        String class1 = "1801";
        map.put(class1, list);
        Student studentD = new Student("小明", 28, "男");
        Student studentE = new Student("小红", 29, "女");
        ArrayList<Student> list2 = new ArrayList<Student>();
        list2.add(studentD);
        list2.add(studentE);
        String class2 = "1802";
        map.put(class2, list2);

        //遍历
        Set<String> classNames = map.keySet();
        for (String className : classNames) {
            System.out.println("班级：" + className);
            List<Student> list3 = map.get(className);
            for (Student student : list3) {
                System.out.println(student);
            }
        }
    }
}
