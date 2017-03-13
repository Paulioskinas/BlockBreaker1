package zaidimas;

public class ball {

private String Ball = "Ball.png";
private String BallUP = "BallUP.png";
private String BallDOWN = "BallDOWN.png";
private String BallLEFT = "BallLEFT.png";
private String BallRIGHT = "BallRIGHT.png";

private int dx;
private int dy;
private int x;
private int y;
private int width;
private int height;
private boolean visible;

private ball imageup;
private ball imagedown;
private ball imageleft;
private ball imageright;

public ball() {

    //ImageIcon i1 = new ImageIcon(this.getClass().getResource(BallUP));
    //imageup = i1.getImage();

    //ImageIcon i2 = new ImageIcon(this.getClass().getResource(BallDOWN));
    //imagedown = i2.getImage();

    //ImageIcon i3 = new ImageIcon(this.getClass().getResource(BallLEFT));
    //imageleft = i3.getImage();

    //ImageIcon i4 = new ImageIcon(this.getClass().getResource(BallRIGHT));
    //imageright = i4.getImage();
	
    width(300,
    height = Ball.getHeight(null);
    visible = true;
    x = 270;
    y = 189;

}

public int getDx() {
    return dx;
}

public void setDx(int dx) {
    this.dx = dx;
}

public int getDy() {
    return dy;
}

public void setDy(int dy) {
    this.dy = dy;
}

public int getX() {
    return x;
}

public int getY() {
    return y;
}

public void setX(int x) {
    this.x = x;
}

public void setY(int y) {
    this.y = y;
}

//public Image getImageup() {
    //return imageup;
//}

//public Image getImagedown() {
    //return imagedown;
//}

public Image getImageleft() {
    return imageleft;
}

public Image getImageright() {
    return imageright;
}

public void setVisible(boolean visible) {
    this.visible = visible;
}

public boolean isVisible() {
    return visible;
}

public Rectangle getBounds() {
    return new Rectangle(x, y, width, height);
}

public void move() {

    x += dx;
    y += dy;
}

public void keyPressed(KeyEvent e) {

    int key = e.getKeyCode();

    if (key == KeyEvent.VK_LEFT) {
        dx = -2;
        dy = 0;
    }

    if (key == KeyEvent.VK_RIGHT) {
        dx = 2;
        dy = 0;
    }

    if (key == KeyEvent.VK_UP) {
        dx = 0;
        dy = -2;
    }

    if (key == KeyEvent.VK_DOWN) {
        dx = 0;
        dy = 2; 
    }
    
    public Rectangle getOffsetBounds() {
        return new Rectangle(x + dx, y + dy, width, height);
        
    }   
   