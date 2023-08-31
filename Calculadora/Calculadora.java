package Calculadora;


public class Calculadora {

    private float num1;
    private float num2;


    public Calculadora(){
    
    }

    public Calculadora(float n1,float n2){

        num1=n1;
        num2=n2;
    }


    public void setNum1(float num1){
        this.num1=num1;
    }

    public void setNum2(float num2){
        this.num2=num2;
    }

    public float getNum1(){
        return num1;
    }

    public float getNum2(){
        return num2;
    }

    public void suma(float num1,float num2){

        float suma=0;
        suma=num1+num2;
        System.out.println("El resultado de la suma es: "+suma);

    }

    public void resta(float num1,float num2){

        float resta=0;
        resta =num1-num2;
        System.out.println("El resultado de la resta es: "+resta);
    }

    public void multiplicacion(float num1,float num2){

        float multiplicacion=0;
        multiplicacion = num1*num2;
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);

    }

    //sin usar excepcion
    /*public void division(float num1,float num2){

        float division=0;
        if (num2!=0) {
            division = num1/num2;
            System.out.println("El resultado de la division es: "+division);
        }
        else{
            System.out.println("El denominador debe ser distinto de cero para poder resolver la division");
        }       
    }*/

    //usando excepcion
    public void division(float num1,float num2)throws Exception{

        float division=0;
        if (num2!=0) {
            division = num1/num2;
            System.out.println("El resultado de la division es: "+division);
        }
        else{
            throw new Exception("La division no se puede resolver si el denominador es cero");
        }       
    }

}