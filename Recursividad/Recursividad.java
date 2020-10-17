package Recursividad;

class Recursividad {
    public int recursividadFibo(int fi){
        if(fi>1){
            return recursividadFibo(fi-1)+ recursividadFibo(fi-2);
        }
        else if(fi == 1){
            return 1;
        }
        else if(fi == 0){
            return 0;
        }
        return -1;
    }        
    
    public void recursividadNum(int n){
        if(n <= 10){
            System.out.print(n + " ");
            recursividadNum(n+1);
        }
    }
    
    public int recursividadFact(int f){
        if(f > 0){
            int factorial =f * recursividadFact(f-1);
            return factorial;
        }
        return 1;
    }
    
    public void recursividadDes(int d){        
        if(d>=0 && d<=10){        
            for(int i = 0; i <= d; i++){
                System.out.print(i + " ");                
            }            
            System.out.println("");
            recursividadDes(d-1);
        }                
    }
    public static boolean recursividadPal(String palabra){
        String palabraLimpia = palabra.replaceAll(" ", "");
        System.out.println("Palabra sucia: "+palabra+" palabraLimpia: "+palabraLimpia);
        return recursividadPal(palabraLimpia, 0, palabraLimpia.length()-1);
    }

    public static boolean recursividadPal(String palabra, int ini, int fin){
        if(fin-ini+1==0 || fin-ini+1 == 1)
            return true;
        else{
        if(palabra.charAt(ini) == palabra.charAt(fin)){
            return recursividadPal(palabra, ini+1, fin-1);
        }
        else{
            return false;
        }
        }
    }
}
