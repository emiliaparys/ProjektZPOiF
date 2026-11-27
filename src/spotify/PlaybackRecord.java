package spotify;
import java.time.Instant;

public record PlaybackRecord (
    //klasa przechowująca dane o jednym odtworzeniu
    String trackID,
    String trackName,
    String artistID,
    String artistName,
    long durationMs,
    Instant playedAt,
    boolean skipped) {}
