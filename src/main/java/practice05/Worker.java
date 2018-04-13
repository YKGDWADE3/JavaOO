package practice05;

import configs.GlobalConfig;

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " " + GlobalConfig.WORKER_INTRO;
    }
}
