package com.company.OnlineRadioDatabase.Models;

import com.company.OnlineRadioDatabase.Constants.InvalidSongValueConstants;
import com.company.OnlineRadioDatabase.SongExceptions.InvalidArtistException;
import com.company.OnlineRadioDatabase.SongExceptions.InvalidSongException;
import com.company.OnlineRadioDatabase.SongExceptions.InvalidSongNameException;
import com.company.OnlineRadioDatabase.SongExceptions.LengthExceptions.InvalidSongMinutesException;
import com.company.OnlineRadioDatabase.SongExceptions.LengthExceptions.InvalidSongSecondsException;

public class Song {
    private String artisName;
    private String songName;
    private int minutes;
    private int seconds;

    public Song(String artisName, String songName, int minutes, int seconds) throws InvalidSongException {
        setArtisName(artisName);
        setSongName(songName);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    private void setArtisName(String artisName) throws InvalidArtistException {
        if (artisName.length() < InvalidSongValueConstants.MIN_ARTIST_NAME_LENGTH || artisName.length() > InvalidSongValueConstants.MAX_ARTIST_NAME_LENGTH) {
            throw new InvalidArtistException();
        }
        this.artisName = artisName;
    }

    private void setSongName(String songName) throws InvalidSongNameException {
        if (songName.length() < InvalidSongValueConstants.MIN_SONG_NAME_LENGTH || songName.length() > InvalidSongValueConstants.MAX_SONG_NAME_LENGTH) {
            throw new InvalidSongNameException();
        }
        this.songName = songName;
    }

    private void setMinutes(int minutes) throws InvalidSongMinutesException {
        if (minutes < InvalidSongValueConstants.MIN_SONG_MINUTES || minutes > InvalidSongValueConstants.MAX_SONG_MINUTES) {
            throw new InvalidSongMinutesException();
        }
        this.minutes = minutes;
    }

    private void setSeconds(int seconds) throws InvalidSongSecondsException {
        if (seconds < InvalidSongValueConstants.MIN_SONG_SECONDS || seconds > InvalidSongValueConstants.MAX_SONG_SECONDS) {
            throw new InvalidSongSecondsException();
        }
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
