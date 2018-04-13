package practice10;

public class Person {
    private long id;
    private String name;

    private Integer age;

    public Person(long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            return id == ((Person)obj).getId();
        }
        return false;
    }
}
