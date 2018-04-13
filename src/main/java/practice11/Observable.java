package practice11;

public interface Observable {
    void register(Observer observer);

    void remove(Observer observer);

    void notifyNewStudent(Student student);
    void notifyNewLeader(Student student);
}
