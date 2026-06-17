package com.sparkco.lab2_api.features.album;

public class AlbumDTO {

    private Integer albumId;
    private String title;
    private Integer artistId;

    public AlbumDTO() {
    }

    public AlbumDTO(Integer albumId, String title, Integer artistId) {
        this.albumId = albumId;
        this.title = title;
        this.artistId = artistId;
    }

    public AlbumDTO(String title, Integer artistId) {
        this.title = title;
        this.artistId = artistId;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }
}
