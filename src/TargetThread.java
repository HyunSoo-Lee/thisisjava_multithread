//Thread State 확인 연습 코드
public class TargetThread extends Thread{
    public void run() {
        //RUNNABLE 상태 유지
        for(long i = 0; i<1000000000; i++){}

        //TIMED_WAITING 상태
        try{
            //1.5초간 일시 정지
            Thread.sleep(500);
        } catch(Exception e){}

        //RUNNABLE 상태 유지
        for(long i = 0; i<1000000000; i++){}
    }
}
