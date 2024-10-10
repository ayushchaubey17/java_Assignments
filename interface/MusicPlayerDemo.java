import java.util.Scanner;

// Interface Playable
interface Playable {
    void play();
    void pause();
    void stop();
}

// Class implementing MP3Player
class MP3Player implements Playable {
    private boolean isPlaying;

    @Override
    public void play() {
        if (!isPlaying) {
            System.out.println("MP3 Player: Playing music...");
            isPlaying = true;
        } else {
            System.out.println("MP3 Player: Already playing.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("MP3 Player: Pausing music...");
            isPlaying = false;
        } else {
            System.out.println("MP3 Player: Music is already paused.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("MP3 Player: Stopping music...");
            isPlaying = false;
        } else {
            System.out.println("MP3 Player: Music is already stopped.");
        }
    }
}

// Class implementing CDPlayer
class CDPlayer implements Playable {
    private boolean isPlaying;

    @Override
    public void play() {
        if (!isPlaying) {
            System.out.println("CD Player: Playing CD...");
            isPlaying = true;
        } else {
            System.out.println("CD Player: Already playing.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("CD Player: Pausing CD...");
            isPlaying = false;
        } else {
            System.out.println("CD Player: CD is already paused.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("CD Player: Stopping CD...");
            isPlaying = false;
        } else {
            System.out.println("CD Player: CD is already stopped.");
        }
    }
}

// Class implementing StreamingPlayer
class StreamingPlayer implements Playable {
    private boolean isPlaying;

    @Override
    public void play() {
        if (!isPlaying) {
            System.out.println("Streaming Player: Streaming music...");
            isPlaying = true;
        } else {
            System.out.println("Streaming Player: Already streaming.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("Streaming Player: Pausing stream...");
            isPlaying = false;
        } else {
            System.out.println("Streaming Player: Stream is already paused.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("Streaming Player: Stopping stream...");
            isPlaying = false;
        } else {
            System.out.println("Streaming Player: Stream is already stopped.");
        }
    }
}

// Main class to demonstrate the playback control
public class MusicPlayerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playable player = null;

        // User selects the type of player
        System.out.println("Select a music player:");
        System.out.println("1. MP3 Player");
        System.out.println("2. CD Player");
        System.out.println("3. Streaming Player");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                player = new MP3Player();
                break;
            case 2:
                player = new CDPlayer();
                break;
            case 3:
                player = new StreamingPlayer();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to MP3 Player.");
                player = new MP3Player();
        }

        // Control playback
        boolean running = true;
        while (running) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Exit");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the player.");
                    break;
                default:
                    System.out.println("Invalid action. Please try again.");
            }
        }
        scanner.close();
    }
}
