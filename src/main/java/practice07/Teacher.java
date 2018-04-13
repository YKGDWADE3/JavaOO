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
        return mKlass != null ? super.introduce() + " " + GlobalConfig.TEACHER_INTRO + mKlass.getNumber() + "."
                : super.introduce() + " " + GlobalConfig.TEACHER_NO_CLASS_INTRO;
    }

    public String introduceWith(Student student){
        if (student != null && student.getKlass() != null && mKlass != null) {
            if (student.getKlass().getNumber() == mKlass.getNumber()) {
                return super.introduce() + " " + GlobalConfig.TEACHER_STU_INTRO + student.getName() + ".";
            }
        }
        return super.introduce() + " " + GlobalConfig.TEACHER_NO_STU_INTRO + student.getName() + ".";
    }

    public Klass getKlass() {
        return mKlass;
    }

    public void setKlass(Klass klass) {
        mKlass = klass;
    }
}
