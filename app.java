public class app {
    public static void main(String[] args) {
        algoritimo f = new algoritimo(); // Cria o Objeto

        for (long n = 10; n < 220; n += 30) {
            long r = f.f5(n); // Chame uma a uma as funcoes

            System.out.println(n + ";" + r); // analisa os seus comportamentos.
        }
    }
}