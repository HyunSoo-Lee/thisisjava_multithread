public class ThreadGroupExample {
    public static void main(String[]args){
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("[Print result of 'list() method' from main Thread Group]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();

        try{Thread.sleep(3000);} catch(InterruptedException e) {}
        System.out.println("[Using interrupt() method from myGroup threadGroup]");
        myGroup.interrupt();
    }
}
