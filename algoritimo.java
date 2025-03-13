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


// Algoritimo 2°
    public int f2(int n){ 
        int res = 0;
        int cont = 0;
        for(int i = n; i <= n+1; i += 2 ){
            for(int j = n+1; j <= n*n; j += 2 ){
                for(int k = i+1; k <= 2*n; k += 2 ){
                    res = res + n*k;
                    cont++;}
                }
            }
        return cont;
    }


// // Algoritimo 3°
//     public int f3(int n){ 
//         int res = 0;
//         int cont = 0;
//         for(int i = n+1; i <= n+1; i += 1 ){
//             for(int j = n; j <= i+1; j += j/2+1 ){
//                 for(int k = j; k <= n*j; k += abs(j-i)+1 ){ 
//                     res = res + n*k; 
//                     cont++;}
//                 }
//             }
//         return cont;
//     }


public int f4( int n ) { int i, j, k, res = 0 int cont_op = 0 for( i = n/2; i <= n*n; i += 1 ) for( j = 1; j <= n*n; j += i/2+1 ) for( k = 2; k <= i*j; k += j/2+1 ) { res = res + n-1 cont_op++ } return cont_op 8 }








// Algoritimo 5°
    public int f5(int n){
        int res = 0;
        int cont = 0;
        for(int i = n/2; i <= n+1; i += 2 ){
            for(int j = i; j <= n*i; j += i/2+1 ){
                for(int k = i+1; k <= n*j; k += 1 ){
                    res = res + k*j;
                    cont++;}
                }
            }
        return cont;
    }

}