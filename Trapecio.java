/**
* Esta clase define objetos de tipo Trapecio con las bases y la altura como atributos.
* @version 1.2/2020
*/
public class Trapecio {
    int baseMayor; // Atributo que define la base mayor de un trapecio
    int baseMenor; // Atributo que define la base menor de un trapecio
    int altura; // Atributo que define la altura de un trapecio

    /**
    * Constructor de la clase Trapecio
    * @param baseMayor Parámetro que define la longitud de la base mayor
    * @param baseMenor Parámetro que define la longitud de la base menor
    * @param altura Parámetro que define la altura del trapecio
    */
    public Trapecio(int baseMayor, int baseMenor, int altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    /**
    * Método que calcula y devuelve el área de un trapecio
    * @return Área de un trapecio
    */
    double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    /**
    * Método que calcula y devuelve el perímetro de un trapecio
    * @return Perímetro de un trapecio
    */
    double calcularPerímetro() {
        // Para calcular el perímetro se asume que el trapecio es isósceles.
        double lado = Math.sqrt(Math.pow((baseMayor - baseMenor) / 2.0, 2) + Math.pow(altura, 2));
        return baseMayor + baseMenor + 2 * lado;
    }
}
