package practice09;


import configs.GlobalConfig;

public class Klass {
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
                return;
            }
        }
        System.out.print(GlobalConfig.STUDENT_NOT_APPEND);
    }

    public void appendMember(Student student) {
        if (student != null ) {
            if (student.getKlass() != null && student.getKlass().getNumber() != number) {
                System.out.print(GlobalConfig.STUDENT_NOT_APPEND);
            }
        }
    }
}
