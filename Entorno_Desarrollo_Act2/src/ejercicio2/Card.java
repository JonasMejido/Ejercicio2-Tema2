package ejercicio2;

public class Card {

    // Atributos que representan el palo y el valor de la carta
    public String suit;
    public String value;
    
    // Constructor que inicializa los atributos con los valores dados
    public Card(String suit, String value) {
        this.suit = suit;  // Asigna el palo de la carta (ej. Corazones, Diamantes, etc.)
        this.value = value;  // Asigna el valor de la carta (ej. As, 2, 3, etc.)
    }
    
    // Método que devuelve una representación en forma de cadena de la carta
    public String toString() {
        // Devuelve el palo y el valor concatenados con un guion entre ellos
        return (this.suit + "-" + this.value);
    }
}
