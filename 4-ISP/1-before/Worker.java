public interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    @Override
    public void work() {
    System.out.println("Les humains travaillent");
    }

    @Override
    public void eat() {
    System.out.println(" Les humains mangent");
    }
}


class RobotWorker implements Worker {
    @Override
    public void work() {
    System.out.println("Les Robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
    System.out.println("l'on ne doit pas faire manger un robot");
    throw new UnsupportedOperationException("Les Robots ne mangent pas");
    }
}