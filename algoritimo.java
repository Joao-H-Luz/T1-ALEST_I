public class algoritimo {

// Algoritimo 1°
    public int f1(int n){
        int res = 0;
        int cont = 0;
        for(int i = n; i <= n+1; i += 1 ){
            for(int j = n+1; j <= n+i; j += i ){
                for(int k = 1; k <= i*i; k += i/2+1 ){ 
                    res = res + i; 
                    cont++;}
                }
            }
        return cont;
    }

        
}