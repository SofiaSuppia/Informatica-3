package Recursividad;

public class Ejercicios {
    
    private int num;
    private int num1;
    private int resultado;
    private int i;

    public Ejercicios(){

    }

    public Ejercicios(int num, int resultado,int num1,int i) {
        this.num = num;
        this.resultado = resultado;
        this.num1=num1;
        this.i=i;
    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int ej1(int num){

        int resultado=0;

        if (num==0 || num==1) {
            return 1;
        }else{
            resultado=num*ej1(num-1);
        }
        return resultado;
    }

    public int ej2(int num){

        int resultado=0;

        if (num<=0) {
            return 0;
        }else{
            resultado=num+ej2(num-1);
        }
        return resultado;
    }

    public int ej3(int n1,int n2){

        int resultado=0;
        
        if(n2==0){
            return 1;
        }
        resultado=n1*ej3(n1,n2-1);
        
        return resultado;
    }

    public int ej4(int n1){

        int resultado=0;
        if(n1==1){
            System.out.println(" "+n1);
            return 1;
        }
        System.out.print(" "+n1);
        resultado=ej4(n1-1);
        return resultado;
    }

    public int ej5(int n1,int n2){

        int resultado=0;
        if(n2==0){
            return 0;
        }
        resultado=n1+ej5(n1,n2-1);
        return resultado;
    }

    public void ej6(int arreglo[],int tamArreglo){

        if(tamArreglo >= 0){
            System.out.print(" "+arreglo[tamArreglo]);
            ej6(arreglo,tamArreglo-1);
        }
    }

    public  int ej7(int num){
        if (num==0) {
            return 0;
        }
        return (num % 2) + ej7(num/2);
    }
}
