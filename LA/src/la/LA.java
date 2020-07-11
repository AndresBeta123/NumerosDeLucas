/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la;

/**
 *
 * @author andre
 */
public class LA {

    /**
     * @param args the command line arguments
     */
    
    
    public static int lucasNumbers(int n){
    if(n==0){
    return 2;
    }
    if(n==1){
    return 1;
    }
    int a = recursiveLucasNumbers(n-2,1,2);
    return a;    
    }
    public static int recursiveLucasNumbers(int n,int L1,int L0){
    int L2 = L0+L1;
    int a;
    if(n>0){
    a = recursiveLucasNumbers(n-1,L2,L1);
    return a;
    }
    return L2;
    }
    
    public static int lucasNumbersCloseTo(int n){
    boolean p = true;
    int i=0;
    int L0 = 2;
    int L1 = 1;
    if(n==1){
    return 1;
    }
    if(n==2){
    return 2;
    }
    if(n==3){
    return L0+L1;
    }
    int past,present,future;
    while(p){
    past = recursiveLucasNumbers(i,L1,L0);
    present = recursiveLucasNumbers(i+1,L1,L0);
    
    if(present>n){
    return closesNumber(n,past,present);
    }
    i++;
    }
    return 0;    
    }
    
    public static int closesNumber(int n,int a,int b){
    int a2 = Math.abs(a-n);
    int b2 = Math.abs(b-n);
    if(a2<b2){
    return a;
    }
    return b;
    }
    
    public static int lucasNumberFGT(int n){
    int L1,L0;
    L0 = 2;
    L1 = 1;
    int a,i;
    if(n==0){
    return 1;
    }
    if(n==1){
    return 2;
    }
    if(n==2){
    return 3;
    }
    i=0;
    while(true){
    a = recursiveLucasNumbers(i,L1,L0);
    if(a>n){
    return a;
    }
    i++;
    }
    }

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("18th numero de Lucas:");
        System.out.println(lucasNumbers(18));
        System.out.println("Numero mas cercano a mil");
        System.out.println(lucasNumbersCloseTo(1000));
        System.out.println("primer numero mayor que 100");
        System.out.println(lucasNumberFGT(100));
    }
    
}
