package practice04;

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
        return super.introduce() + " " + GlobalConfig.STUDENT_INTRO + klass + ".";
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
