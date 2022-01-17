public class MySecondThread implements Runnable {

//    private Thread thread;
//    public MySecondThread(){
//    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println(i);
        }
    }
}
