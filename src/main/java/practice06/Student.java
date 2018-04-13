package practice06;

import configs.GlobalConfig;

public class Student extends Person{
    private Integer klass;

    public Student(String name, Integer age) {
        super(name, age);
    }

    public Student(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " " + GlobalConfig.STUDENT_INTRO
                + " " + GlobalConfig.STUDENT_AT_CLASS + klass + ".";
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }
}
