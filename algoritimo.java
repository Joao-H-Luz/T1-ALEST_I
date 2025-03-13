import java.lang.Math;
public class algoritimo {

    // Algoritimo 1°
    public int f1(int n) {
        int res = 0;
        int cont = 0;
        for (int i = n; i <= n + 1; i += 1) {
            for (int j = n + 1; j <= n + i; j += i) {
                for (int k = 1; k <= i * i; k += i / 2 + 1) {
                    res = res + i;
                    cont++;
                }
            }
        }
        return cont;
    }

    // Algoritimo 2°
    public int f2(int n) {
        int res = 0;
        int cont = 0;
        for (int i = n; i <= n + 1; i += 2) {
            for (int j = n + 1; j <= n * n; j += 2) {
                for (int k = i + 1; k <= 2 * n; k += 2) {
                    res = res + n * k;
                    cont++;
                }
            }
        }
        return cont;
    }

    // Algoritimo 3°
    public int f3(int n){
        int res = 0;
        int cont = 0;
        for(int i = n+1; i <= n+1; i += 1 ){
            for(int j = n; j <= i+1; j += j/2+1 ){
                for(int k = j; k <= n*j; k += Math.abs(j-i)+1 ){
                    res = res + n*k;
                    cont++;
                }
            }
        }
        return cont;
    }

    // Algoritimo 4°
    public long f4(long n) { // Ajustar a Variavel (n), para long
        long res = 0;
        int cont = 0;
        for (long i = n / 2; i <= n * n; i += 1) {
            for (long j = 1; j <= n * n; j += i / 2 + 1) {
                for (long k = 2; k <= i * j; k += j / 2 + 1) {
                    res = res + n - 1;
                    cont++;
                }
            }
        }
        return cont; // Evitar OverFLower
    }

    // Algoritimo 5°
    public long f5(long n) { // Ajustar a Variavel (n), para long
        long res = 0;
        int cont = 0;
        for (long i = n / 2; i <= n + 1; i += 2) {
            for (long j = i; j <= n * i; j += i / 2 + 1) {
                for (long k = i + 1; k <= n * j; k += 1) {
                    res = res + k * j;
                    cont++;
                }
            }
        }
        return cont; // Evitar OverFLower
    }

}