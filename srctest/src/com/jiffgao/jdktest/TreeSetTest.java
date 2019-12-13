package com.jiffgao.jdktest;

import com.jiffgao.myutil.MyTreeSet;

import java.util.Comparator;

/**
 * @author Administrator
 * @ClassName: TreeSetTest
 * @Description:
 * @date: 2019/12/13
 */
public class TreeSetTest {
    class Person implements Comparable{
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Comparator<Person> comparator = new Comparator<Person>() {
        //     @Override
        //     public int compare(Person o1, Person o2) {
        //         return o1.getName().hashCode() - o2.getName().hashCode();
        //     }
        // };
        MyTreeSet<Person> set = new MyTreeSet<Person>();
        Person person = new TreeSetTest().new Person();
        person.setName("赵六");
        person.setAge(22);
        set.add(person);
        Person person1 = new TreeSetTest().new Person();
        person1.setName("李四");
        person1.setAge(25);
        set.add(person1);
        Person person2 = new TreeSetTest().new Person();
        person2.setName("王五");
        person2.setAge(18);
        set.add(person2);
        System.out.println(set.size());
        set.forEach(x -> System.out.println(x.getName()+": "+x.getAge()));
    }
}
