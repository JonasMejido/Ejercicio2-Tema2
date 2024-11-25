package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

    public static void main(String[] args) {
        
        // Definición de los palos y valores de las cartas
        String[] suits = { "Spades", "Diamonds", "Club", "Heart" };  // Palos disponibles
        String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };  // Valores de las cartas

        // Lista que contendrá el mazo de cartas
        ArrayList<Card> deck = new ArrayList<Card>();

        // Llenado del mazo con todas las combinaciones de palos y valores
        for (int i = 0; i < suits.length; i++) {  // Recorre cada palo
            for (int j = 0; j < values.length; j++) {  // Recorre cada valor
                // Crea una nueva carta con el palo y valor actuales
                Card card = new Card(suits[i], values[j]);
                // Agrega la carta al mazo
                deck.add(card);
            }
        }

        // Mezcla aleatoriamente las cartas del mazo
        for (int i = 0; i < deck.size(); i++) {  // Recorre el mazo
            // Genera un índice aleatorio para intercambiar las cartas
            int j = (int) Math.floor(Math.random() * i);  // Genera un número aleatorio entre 0 e i-1
            // Intercambia la carta en la posición i con la carta en la posición j
            Card tmp = deck.get(i);  // Guarda temporalmente la carta en i
            deck.set(i, deck.get(j));  // Coloca la carta de j en la posición i
            deck.set(j, tmp);  // Coloca la carta temporal en la posición j
        }

        // Imprime las primeras 5 cartas del mazo mezclado
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));  // Muestra cada carta en formato "palo-valor"
        }
    }
}
