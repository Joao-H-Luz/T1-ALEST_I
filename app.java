public class app {
    public static void main(String[] args) {
        algoritimo f = new algoritimo(); // Cria o Objeto

        // int
        for (int n = 10; n < 1000; n += 50) {
            int r = f.f3(n); // Chame uma a uma as funcoes.

            System.out.println(n + ";" + r); // analisa os seus comportamentos.
        }

        // long
        for (long n = 10; n < 220; n += 30) { // Chamar as funções 4 e 5 como long para evitar OverFlow.
            long r = f.f5(n); 

            System.out.println(n + ";" + r); // analisa os seus comportamentos.
        }
    }
}