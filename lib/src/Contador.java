

public class Contador extends Thread{
    @Override
    public void run() {
        for (int contador1 = 1; contador1 <= 10; contador1 ++){
            System.out.println(contador1);
        }
        for (int contador2 = 1; contador2 <= 10; contador2 ++){
            System.out.println(contador2);
        }
        super.start();
    }
    public static void main(String[]args){
        Contador t1 = new Contador();
        t1.start();
        //t1.start();


    }
}

