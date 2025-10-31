package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaTotal = 0.0;

            for(Figura f : figuras) {
                somaTotal += f.calcularArea();
            }

        return somaTotal;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {

        List<Figura> areaMaiorQue20 = new ArrayList<>();

        for(Figura f : figuras) {
            if(f.calcularArea() > 20) {
                areaMaiorQue20.add(f);
            }
        }
        return areaMaiorQue20;
    }

    public List<Figura> buscarQuadrados() {

        List<Figura> resultado = new ArrayList<>();

        for (Figura f : figuras) {
            if (f instanceof Quadrado) {
                resultado.add(f);
            }
        }
        return resultado;
    }
}
