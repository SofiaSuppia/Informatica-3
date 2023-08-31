import java.util.ArrayList;
import java.util.List;

public class Historial {
    private float num1;
    private float num2;
    private float resultados;
    List<String> historial = new ArrayList<>();

    public Historial() {
    }

    public Historial(float num1, float num2, float resultados) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultados = resultados;
    }

    public float getNum1() {
        return num1;
    }
    
    public float getNum2() {
        return num2;
    }
    
    public float getResultados() {
        return resultados;
    }
    
    public void setNum1(float num1) {
        this.num1 = num1;
    }
    
    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public void setResultados(float resultados) {
        this.resultados = resultados;
    }

}
