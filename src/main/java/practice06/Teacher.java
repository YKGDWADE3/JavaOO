package practice06;

import configs.GlobalConfig;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return klass == null ? super.introduce() + " " + GlobalConfig.TEACHER_NO_CLASS_INTRO
                : super.introduce() + " " + GlobalConfig.TEACHER_INTRO + klass + ".";
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }
}
