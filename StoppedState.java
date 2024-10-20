public class StoppedState implements State {
    private MediaPlayer player;

    public StoppedState(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public void pressPlay() {
        System.out.println("Starting playback.");
        player.setState(new PlayingState(player));
    }

    @Override
    public void pressPause() {
        System.out.println("Cannot pause. The media is stopped.");
    }

    @Override
    public void pressStop() {
        System.out.println("Already stopped.");
    }
}