/**
* Esta clase define objetos de tipo Rombo con las diagonales como atributos.
* @version 1.2/2020
*/
public class Rombo {
    int diagonalMayor; // Atributo que define la diagonal mayor de un rombo
    int diagonalMenor; // Atributo que define la diagonal menor de un rombo

    /**
    * Constructor de la clase Rombo
    * @param diagonalMayor Parámetro que define la longitud de la diagonal mayor
    * @param diagonalMenor Parámetro que define la longitud de la diagonal menor
    */
    public Rombo(int diagonalMayor, int diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    /**
    * Método que calcula y devuelve el área de un rombo
    * @return Área de un rombo
    */
    double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2.0;
    }

    /**
    * Método que calcula y devuelve el perímetro de un rombo
    * @return Perímetro de un rombo
    */
    double calcularPerímetro() {
        double lado = Math.sqrt(Math.pow(diagonalMayor / 2.0, 2) + Math.pow(diagonalMenor / 2.0, 2));
        return 4 * lado;
    }
}
