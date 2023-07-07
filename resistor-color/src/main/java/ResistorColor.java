import java.util.Arrays;
class ResistorColor {
    String[] colorBands = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        int colorIndex = Arrays.asList(colorBands).indexOf(color);
        return colorIndex;
    }

    String[] colors() {
        return colorBands;
    }
}
