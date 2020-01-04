package com.xinhai.thinking;

public class Ja8_8_3 {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(2, 2);
    }
}

class Glyph {
    void draw() {  System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
class RectangularGlyph extends Glyph{
    private int width = 4;
    private int height = 5;

    public RectangularGlyph(int width,int height) {
        this.width = width;
        this.height = height;
        System.out.println("RectangularGlyph.width = "+width+" height = "+height);
    }
    public void draw() {
        System.out.println("RectangularGlyph.area = "+(width*height));
    }
}
