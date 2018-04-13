package practice09;

import configs.GlobalConfig;

public class Teacher extends Person {
    private Klass mKlass;

    public Teacher(long id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher(long id, String name, Integer age, Klass klass) {
        super(id, name, age);
        mKlass = klass;
    }

    @Override
    public String introduce() {
        if (mKlass != null) {
            return super.introduce() + " " + GlobalConfig.TEACHER_INTRO
                    + " " + GlobalConfig.TEACH_CLASS + mKlass.getNumber() + ".";
        }
        return super.introduce() + " " + GlobalConfig.TEACH_NO_CLASS;
    }

    public String introduceWith(Student student){
        if (mKlass != null && student != null && student.getKlass() != null) {
            if (mKlass.getNumber() == student.getKlass().getNumber()) {
                return super.introduce() + " " + GlobalConfig.TEACHER_INTRO + " "
                        + GlobalConfig.TEACH_STU + student.getName() + ".";
            }
        }
        return super.introduce() + " " + GlobalConfig.TEACHER_INTRO + " "
                + GlobalConfig.TEACH_NOT_STU + student.getName() + ".";
    }
    public Klass getKlass() {
        return mKlass;
    }

    public void setKlass(Klass klass) {
        mKlass = klass;
    }
}
