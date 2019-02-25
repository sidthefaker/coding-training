package codingtraining.ex7;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRoomArea {
    private static final RoomArea roomArea = new RoomArea();
    @Test
    public void testRoomArea() {
        int roomAreaFeet = roomArea.getArea(15, 20);
        assertEquals(300, roomAreaFeet);
    }

    public void testSquareFeetToSquareMeter() {
        assertEquals(27.871, roomArea.squareFeetToSquareMeter(300));
    }
}
