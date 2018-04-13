package practice10;

import configs.GlobalConfig;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Teacher extends Person{
    private HashSet<Klass> classes;

    public Teacher(long id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher(long id, String name, Integer age, HashSet<Klass> hashSet) {
        super(id, name, age);
        classes = hashSet;
    }

    @Override
    public String introduce() {
        if (classes != null && classes.size() > 0) {
            TreeSet<Klass> treeSet = new TreeSet<>(classes);
            treeSet.comparator();
            StringBuffer classStringBuffer = new StringBuffer();
            for (Klass klass : treeSet) {
                classStringBuffer.append(klass.getNumber() + ", ");
            }
            classStringBuffer.deleteCharAt(classStringBuffer.length() - 1);
            classStringBuffer.deleteCharAt(classStringBuffer.length() - 1);

            return super.introduce() + " " + GlobalConfig.TEACHER_INTRO
                    + " " + GlobalConfig.TEACH_CLASS + classStringBuffer.toString() + ".";
        }
        return super.introduce() + " " + GlobalConfig.TEACH_NO_CLASS;
    }

    public String introduceWith(Student student){
        if (isTeaching(student)) {
            return super.introduce() + " " + GlobalConfig.TEACHER_INTRO + " "
                    + GlobalConfig.TEACH_STU + student.getName() + ".";

        } else {
            return super.introduce() + " " + GlobalConfig.TEACHER_INTRO + " "
                    + GlobalConfig.TEACH_NOT_STU + student.getName() + ".";
        }
    }

    public boolean isTeaching(Student student) {
        if (classes != null && classes.size() > 0) {
            for (Klass aClass : classes) {
                if (aClass.isIn(student)){
                    return true;
                }
            }

        }
        return false;
    }

    public HashSet<Klass> getClasses() {
        return classes;
    }

    public void setClasses(HashSet<Klass> classes) {
        this.classes = classes;
    }
}
