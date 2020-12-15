import java.util.Random;

public class Trap {
    Random gen = new Random();
    private String message;
    private int x;
    private int y;

    public Trap(int x, int y) {
        switch(gen.nextInt(7)) {
            case 0:
                this.message = "You fall into a bottomless pit and you die!";
                break;
            case 1:
                this.message = "You step on a gigantic bear trap and you die!";
                break;
            case 2:
                this.message = "A giant stone block falls on your head and you die!";
                break;
            case 3:
                this.message = "You activate a tripwire that shoots arrows at you and you die!";
                break;
            case 4:
                this.message = "A magical rune sets you on fire and you die!";
                break;
            case 5:
                this.message = "You get cut up by swinging blades from the ceiling and you die!";
                break;
            case 6:
                this.message = "You step on a land mine and you die!";
                break;
            case 7:
                this.message = "Giant spikes come out of the floor and impale you and you die!";
                break;
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
