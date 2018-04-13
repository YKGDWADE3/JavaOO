package practice02;

import configs.GlobalConfig;

public class Student extends Person{
    private int klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return GlobalConfig.STUDENT_INTRO + " " + GlobalConfig.STUDENT_AT_CLASS + klass + ".";
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
