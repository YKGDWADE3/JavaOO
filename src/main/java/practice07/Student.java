package practice07;

import configs.GlobalConfig;

import javax.xml.bind.annotation.XmlElementDecl;

public class Student extends Person{
    private Klass mKlass;

    public Student(String name, Integer age) {
        super(name, age);
    }

    public Student(String name, Integer age, Klass klass) {
        super(name, age);
        mKlass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " " + GlobalConfig.STUDENT_INTRO
                + " " + GlobalConfig.STUDENT_AT_CLASS + mKlass.getNumber() + ".";
    }

    public Klass getKlass() {
        return mKlass;
    }

    public void setKlass(Klass klass) {
        mKlass = klass;
    }
}
