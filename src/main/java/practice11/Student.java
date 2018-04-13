package practice11;

import configs.GlobalConfig;

public class Student extends Person{
    private Klass mKlass;

    public Student(long id, String name, Integer age) {
        super(id, name, age);
    }

    public Student(long id, String name, Integer age, Klass klass) {
        super(id, name, age);
        mKlass = klass;
    }

    @Override
    public String introduce() {
        if (mKlass.getLeader() == this){
            return super.introduce() + " " + GlobalConfig.STUDENT_INTRO
                    + " " + GlobalConfig.STUDENT_LEADER_CLASS + mKlass.getNumber() + ".";
        }
        return super.introduce() + " " + GlobalConfig.STUDENT_INTRO + " "
                + GlobalConfig.STUDENT_AT_CLASS + mKlass.getNumber() + ".";
    }

    public Klass getKlass() {
        return mKlass;
    }

    public void setKlass(Klass klass) {
        mKlass = klass;
    }
}
