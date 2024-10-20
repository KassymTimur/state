public class PlayingState implements State {
    private MediaPlayer player;

    public PlayingState(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public void pressPlay() {
        System.out.println("Already playing.");
    }

    @Override
    public void pressPause() {
        System.out.println("Pausing the media.");
        player.setState(new PausedState(player));
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping the media.");
        player.setState(new StoppedState(player));
    }
}