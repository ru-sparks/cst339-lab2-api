package com.sparkco.lab2_api.features.playlist_track;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "playlist_track")
public class PlaylistTrack {

    @Id
    @Column(name = "playlist_id")
    private Integer playlistId;
    @Id
    @Column(name = "track_id")
    private Integer trackId;

    public Integer getPlaylistId() {
        return this.playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    public Integer getTrackId() {
        return this.trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    @Override
    public String toString() {
        return "PlaylistTrack{" +
                "playlistId=" + playlistId +
                ", trackId=" + trackId +
                '}';
    }
}
