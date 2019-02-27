package codingtraining.ex8;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class TestPizzaParty {
    @Test
    public void testInput() {
        PizzaParty pizzaParty = new PizzaParty();

        try {
            pizzaParty.setPieces(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("larger than 0"));
        }

        try {
            pizzaParty.setPieces(3);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("even number"));
        }

        try {
            pizzaParty.setPeople(-4);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("larger than 0"));
        }

        try {
            pizzaParty.setPiecesPerPerson(-4);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("larger than 0"));
        }

        try {
            pizzaParty.setPizzas(-4);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("larger than 0"));
        }
    }

    @Test
    public void testState() {
        PizzaParty pizzaParty = new PizzaParty();

        try {
            pizzaParty.orderNow();
            fail();
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("A 'people' must be set before ordering") ||
                    e.getMessage().contains("A 'pieces' must be set before ordering"));
        }

        pizzaParty.setPeople(5);
        pizzaParty.setPieces(6);

        try {
            pizzaParty.orderNow();
            fail();
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("'Pizzas' or 'pieces per person' must be set before ordering."));
        }
    }

    @Test
    public void testPiecesPerPerson() {
        PizzaParty pizzaParty = new PizzaParty();

        pizzaParty.setPeople(8);
        pizzaParty.setPizzas(2);
        pizzaParty.setPieces(8);

        pizzaParty.orderNow();

        assertEquals(2, pizzaParty.getPiecesPerPerson());
        assertEquals(0, pizzaParty.getLeftOver());
    }

    @Test
    public void testPizzas() {
        PizzaParty pizzaParty = new PizzaParty();

        pizzaParty.setPeople(5);
        pizzaParty.setPiecesPerPerson(2);
        pizzaParty.setPieces(8);

        pizzaParty.orderNow();

        assertEquals(2, pizzaParty.getPizzas());
        assertEquals(6, pizzaParty.getLeftOver());
    }
}
