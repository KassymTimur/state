import java.util.Scanner;

public class MediaPlayer {
    private State state;

    public MediaPlayer() {
        this.state = new StoppedState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.pressPlay();
    }

    public void pressPause() {
        state.pressPause();
    }

    public void pressStop() {
        state.pressStop();
    }

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter command (play, pause, stop, exit): ");
            input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "play":
                    player.pressPlay();
                    break;
                case "pause":
                    player.pressPause();
                    break;
                case "stop":
                    player.pressStop();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}