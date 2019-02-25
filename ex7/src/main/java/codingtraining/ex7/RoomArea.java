package codingtraining.ex7;

import condingtraining.util.InputUtil;

import java.io.IOException;

public class RoomArea {
    private final float SQUARE_FEET_TO_SQUARE_METER = 0.09290304f;

    public static void main(String[] args) throws IOException {
        RoomArea roomArea = new RoomArea();
        int length = InputUtil.inputInteger("What is the length of the room in feet? ");
        int width = InputUtil.inputInteger("What is the width of the room in feet? ");

        int areaFeet = roomArea.getArea(length, width);
        float areaMeter = roomArea.squareFeetToSquareMeter(areaFeet);

        System.out.println("The area is");
        System.out.println(areaFeet + " square feet");
        System.out.println(areaMeter + " square meters");

    }

    public float squareFeetToSquareMeter(int areaFeet) {
        return areaFeet * SQUARE_FEET_TO_SQUARE_METER;
    }

    public int getArea(int length, int width) {
        return length * width;
    }
}
