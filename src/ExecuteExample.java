import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

// execute() 메소드로 작업 처리를 요청하는 경우
// execute() 메소드의 경우 작업 처리 결과를 받지 못한다. <-> submit() 메소드와의 차이점
public class ExecuteExample {
    public static void main(String[] args) throws Exception {
        // 최대 스레드 개수가 2인 스래드풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        for(int i=0; i<10; i++){
            //작업 정의
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    //스레드 총 개수 및 작업 스레드 이름 출력
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

                    int poolsize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 개수 : " + poolsize + "] 작업 스레드 이름 : " + threadName);

                    //예외 발생
                    int value = Integer.parseInt("삼");
                }
            };

            //executorService.execute(runnable);
            executorService.submit(runnable);

            Thread.sleep(10);
        }

        executorService.shutdown();
    }
}
