import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ImageObject img1 = new ImageObject(80, 100);
        CanvansedImage c1 = new CanvansedImage(img1, Color.red);
        CanvansedImage c2 = new CanvansedImage(c1, Color.green);
        CanvansedImage c3 = new CanvansedImage(c2, Color.blue);
        Window window = new Window(c3);
        window.setVisible(true);
    }

}
