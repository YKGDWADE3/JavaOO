package practice11;

import configs.GlobalConfig;

import java.util.LinkedHashSet;

public class Klass implements Comparable<Klass>, Observable {

    private LinkedHashSet<Observer> mTeachers = new LinkedHashSet<>();
    private int number;

    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        if (leader != null) {
            if (leader.getKlass() != null && leader.getKlass().getNumber() == number){
                this.leader = leader;
                notifyNewLeader(leader);
                return;
            }
        }
        System.out.print(GlobalConfig.STUDENT_NOT_APPEND);
    }

    public void appendMember(Student student) {
        if (student != null ) {
            if (student.getKlass() != null && student.getKlass().getNumber() != number) {
                student.setKlass(this);
                notifyNewStudent(student);
            }
            student.setKlass(this);
        }
    }

    public boolean isIn(Student student){
        if (student != null && student.getKlass() != null) {
            return student.getKlass().getNumber() == number;
        }
        return false;
    }
    @Override
    public int compareTo(Klass o) {
        if (number <= o.getNumber()) {
            return -1;
        }
        return 1;
    }

    @Override
    public void register(Observer observer) {
        mTeachers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        mTeachers.remove(observer);
    }

    @Override
    public void notifyNewStudent(Student student) {
        for (Observer teacher : mTeachers) {
            teacher.knowJoined(student);
        }
    }

    @Override
    public void notifyNewLeader(Student student) {
        for (Observer teacher : mTeachers) {
            teacher.knowLeader(student);
        }
    }
}
