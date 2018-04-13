package practice03;

import configs.GlobalConfig;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return GlobalConfig.WORKER_INTRO;
    }
}
