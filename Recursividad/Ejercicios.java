package Recursividad;

public class Ejercicios {
    
    private int num;
    private int num1;
    private int resultado;

    public Ejercicios(){

    }
    
    public Ejercicios(int num, int resultado,int num1) {
        this.num = num;
        this.resultado = resultado;
        this.num1=num1;
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

    public int factorial(int num){

        int resultado=0;

        if (num==0 || num==1) {
            return 1;
        }else{
            resultado=num*factorial(num-1);
        }
        return resultado;
    }

    public int ejercicio2(int num){

        int resultado=0;

        if (num<=0) {
            return 0;
        }else{
            resultado=num+ejercicio2(num-1);
        }
        return resultado;
    }
}
