import java.awt.Canvas;

public class Game extends Canvas implements Runnable {


	private static final long serialVersionUID = -8185028503367784873L;
	public static final int WIDTH = 640;
    public static final int HEIGHT = WIDTH / 12 * 9;

    private Thread thread;

    public Game(){
        new Window(WIDTH, HEIGHT, "Building a game.", this);
    }

    public synchronized void start(){

    }

    public void run(){

    }

    public static void main(String[] args) {

    }
}

