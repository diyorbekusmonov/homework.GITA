package SocialNetwork.Videos;

import java.util.Objects;

public class VideoData {
    private final String title;
    private final String description;
    private int likeCount;
    private int dillikeCount;

    public VideoData( String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "VideoData{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", likeCount=" + likeCount +
                ", dillikeCount=" + dillikeCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoData videoData = (VideoData) o;
        return likeCount == videoData.likeCount && dillikeCount == videoData.dillikeCount && Objects.equals(title, videoData.title) && Objects.equals(description, videoData.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, likeCount, dillikeCount);
    }
}
