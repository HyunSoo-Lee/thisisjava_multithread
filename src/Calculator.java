public class Calculator {
    private int memory;

    public int getMemory(){
        return memory;
    }
    //synchronized : 동기화 블럭, 내부코드는 임계영역이므로 한 스레드만 실행할 수 있다.
    public synchronized void setMemory(int memory){
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}
