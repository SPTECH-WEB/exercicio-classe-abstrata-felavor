package school.sptech;

public class Quadrado extends Figura{

    private Double lado;

    public Quadrado(Double lado) {
        super();
        this.lado = lado;
    }
    public Quadrado(){
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Lado: " + lado;
    }

}
