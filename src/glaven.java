public class glaven {
    public static void main(String[] args) {
        Employee pesho = new Employee("Peter Petrov");
        Employee jivko = new Employee("Jivko Ovcharov");

        Task fixWashingMachine = new Task("Fix the washing machine", 6);
        Task paintWall = new Task("Paint the wall", 3);
        Task printTheLabels = new Task("Print the labels", 8);

        pesho.setCurrentTask(fixWashingMachine);
        pesho.work();
        pesho.showReport();
        pesho.setCurrentTask(paintWall);
        pesho.work();
        pesho.showReport();
        jivko.setCurrentTask(paintWall);
        jivko.work();
        jivko.showReport();
        jivko.setCurrentTask(fixWashingMachine);
        jivko.work();
        jivko.showReport();
        paintWall.setWorkingHours(3);
        jivko.setCurrentTask(paintWall);
        jivko.work();
        jivko.showReport();
        jivko.setCurrentTask(printTheLabels);
        jivko.work();
        jivko.showReport();
        pesho.setCurrentTask(printTheLabels);
        pesho.work();
        pesho.showReport();

    }
}
