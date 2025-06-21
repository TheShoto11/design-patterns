package org.sda.adapter;

public class MediaAdapter implements MediaPlayer{

    private final LegacyPlayer legacyPlayer;

    public MediaAdapter(LegacyPlayer legacyPlayer) {
        this.legacyPlayer = legacyPlayer;
    }

    @Override
    public void play(String fileName) {
        legacyPlayer.playFile(fileName);
    }

    public static void main(String[] args) {
        MediaPlayer adapter = new MediaAdapter(new LegacyPlayer());
        adapter.play("track.mp3");
    }
}
