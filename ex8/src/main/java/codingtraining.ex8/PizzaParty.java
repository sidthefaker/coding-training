package codingtraining.ex8;

import condingtraining.util.InputUtil;
import condingtraining.util.IntegerInputValidater;

import java.io.IOException;

public class PizzaParty {
    private int people;
    private int pizzas;
    private int pieces;

    private int piecesPerPerson;
    private int leftOver;

    public static void main(String[] args) throws IOException {
        IntegerInputValidater positive = input -> input > 0;
        IntegerInputValidater positiveEven = input -> input > 0 && input % 2 == 0;

        PizzaParty pizzaParty = new PizzaParty();
        pizzaParty.setPeople(InputUtil.inputInteger("How many people? ", positive));
        pizzaParty.setPizzas(InputUtil.inputInteger("How many pizzas do you have? ", positive));
        pizzaParty.setPieces(InputUtil.inputInteger("How many pieces are in a pizza? ", positiveEven));

        pizzaParty.orderNow();

        System.out.println(pizzaParty.getResult());
    }

    public PizzaParty() {
        reset();
    }

    public void setPeople(int people) {
        if (people <= 0)
            throw new IllegalArgumentException("A 'people' must be larger than 0.");
        this.people = people;
    }

    public void setPizzas(int pizzas) {
        if (pizzas <= 0)
            throw new IllegalArgumentException("A 'pizzas' must be larger than 0.");
        this.pizzas = pizzas;
    }

    public void setPieces(int pieces) {
        if (pieces <= 0)
            throw new IllegalArgumentException("A 'pieces' must be larger than 0.");
        if (pieces % 2 != 0)
            throw new IllegalArgumentException("A 'pieces' must be even number.");
        this.pieces = pieces;
    }

    public void setPiecesPerPerson(int piecesPerPerson) {
        if (piecesPerPerson <= 0)
            throw new IllegalArgumentException("A 'pieces per person' must be larger than 0.");
        this.piecesPerPerson = piecesPerPerson;
    }

    public void orderNow() {
        validateInput();

        if (piecesPerPerson == -1) {
            int totalPieces = pizzas * pieces;
            piecesPerPerson = totalPieces / people;
            leftOver = totalPieces % people;
        } else { // pizzas == -1 --> both can be set but ignore.
            int totalPieces = people * piecesPerPerson;
            pizzas = totalPieces / pieces;
            leftOver = totalPieces % pieces;
            if (leftOver != 0) {
                pizzas += 1;
                leftOver = pieces - leftOver;
            }
        }
    }

    private void validateInput() {
        if (people == -1)
            throw new IllegalStateException("A 'people' must be set before ordering");
        if (pieces == -1)
            throw new IllegalStateException("A 'pieces' must be set before ordering");

        if (piecesPerPerson == -1 && pizzas == -1)
                throw new IllegalStateException("'Pizzas' or 'pieces per person' must be set before ordering.");
    }

    public int getPeople() {
        return people;
    }

    public int getPizzas() {
        return pizzas;
    }

    public int getPieces() {
        return pieces;
    }

    public int getPiecesPerPerson() {
        return piecesPerPerson;
    }

    public int getLeftOver() {
        return leftOver;
    }

    public void reset() {
        people = -1;
        pizzas = -1;
        pieces = -1;
        piecesPerPerson = -1;
        leftOver = -1;
    }

    public String getResult() {
        validateInput();

        StringBuilder result = new StringBuilder();
        result.append(people > 1 ? "person" : "people").append(" with ").append(pizzas > 1 ? "pizza" : "pizzas").append("\n");
        result.append("Each person gets").append(piecesPerPerson > 1 ? "piece" : "pieces").append(" of pizza.\n");
        result.append("There ").append(leftOver > 1 ? "are " : "is ").append(leftOver > 1 ? "leftover piece." : "leftover pieces.");

        return result.toString();
    }
}
