
public class Teste{
    static int contador1 = 0;
    static int contador2 = 0;


    public static void main(String[]args){
        new Thread(t1).start();
        new Thread(t2).start();
    }
    private static void contaMais(String name){
       contador1 ++;
       contador2 ++;
      // System.out.format("%d e %d", contador1, contador2);
       System.out.println("numero: " + contador1 + "numero 2: " +contador2+ " vindo da Thread: " + name);

      // System.out.println("numero: " + contador2 + " vindo da Thread: " + name);

    }
    private static Runnable t1 = new Runnable(){
        public void run(){
            try{
                for (int contador1 = 0; contador1<= 9; contador1 ++ ) {
                    contaMais("t1");
                }
            }catch (Exception e){}
        }
    };
    private static Runnable t2 = new Runnable(){
        public void run(){
            try{
                for (int contador2 = 0; contador2 <= 9; contador2++){
                   contaMais("t2");
                }
            }catch (Exception e){}
        }

    };
}
