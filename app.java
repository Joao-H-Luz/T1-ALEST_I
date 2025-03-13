public class app {
    public static void main(String[] args) {
        algoritimo f  = new algoritimo(); //Cria o Objeto
        
        for(int n=10; n<1000; n+=50) {
            int r = f.f1(n); // Chame uma a uma as funcoes 
                             
            System.out.println(n+";"+r); // analisa os seus comportamentos.
        }     
    }
}