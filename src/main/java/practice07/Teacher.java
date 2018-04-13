package practice07;

import configs.GlobalConfig;

public class Teacher extends Person{
    private Klass mKlass;


    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        mKlass = klass;
    }

    @Override
    public String introduce() {
        return mKlass != null ? super.introduce() + " " + GlobalConfig.TEACHER_INTRO + " "
                + GlobalConfig.TEACH_CLASS + mKlass.getNumber() + "."
                : super.introduce() + " " + GlobalConfig.TEACH_NO_CLASS;
    }

    public String introduceWith(Student student){
        if (student != null && student.getKlass() != null && mKlass != null) {
            if (student.getKlass().getNumber() == mKlass.getNumber()) {
                return super.introduce() + " " + GlobalConfig.TEACHER_INTRO + " "
                        + GlobalConfig.TEACH_STU + student.getName() + ".";
            }
        }
        return super.introduce() + " " + GlobalConfig.TEACHER_INTRO + " " + GlobalConfig.TEACH_NOT_STU + student.getName() + ".";
    }

    public Klass getKlass() {
        return mKlass;
    }

    public void setKlass(Klass klass) {
        mKlass = klass;
    }
}
