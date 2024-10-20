public class PausedState implements State {
    private MediaPlayer player;

    public PausedState(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public void pressPlay() {
        System.out.println("Resuming playback.");
        player.setState(new PlayingState(player));
    }

    @Override
    public void pressPause() {
        System.out.println("Already paused.");
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping the media.");
        player.setState(new StoppedState(player));
    }
}