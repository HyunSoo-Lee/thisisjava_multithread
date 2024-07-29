//Thread State 확인 연습 코드
public class ThreadStateExample {
    public static void main(String[] args){
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
        statePrintThread.start();
    }
}
