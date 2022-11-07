public class MyTestT{
    static int i = 0;
    public static void main (String[] args){
        //new Thread(thread1).start();
        //new Thread(thread2).start();
    }
    private static void conta(String name){
        i++;
        System.out.format("%d", i);
    }
    private static Runnable t1 = new Runnable(){
        public void run(){
            
        }
    };
}