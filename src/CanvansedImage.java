import java.awt.*;

public class CanvansedImage extends Image {

    private Image img;
    private Color c;
    private int tickness = 6;

    public CanvansedImage(Image img, Color c){
        this.img = img;
        this.c = c;

        this.x = img.getX() - tickness;
        this.y = img.getY() - tickness;
        this.width = img.getWidth() + 2 * tickness;
        this.height = img.getHeight() + 2 * tickness;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, width, height);
        img.draw(g);
    }
}
