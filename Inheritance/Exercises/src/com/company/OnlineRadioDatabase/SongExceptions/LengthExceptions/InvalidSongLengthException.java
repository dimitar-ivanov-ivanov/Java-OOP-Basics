package com.company.OnlineRadioDatabase.SongExceptions.LengthExceptions;

import com.company.OnlineRadioDatabase.Constants.ExceptionMessages;
import com.company.OnlineRadioDatabase.SongExceptions.InvalidSongException;

public class InvalidSongLengthException extends InvalidSongException {
    @Override
    public String getMessage() {
        return ExceptionMessages.INVALID_SONG_LENGTH;
    }
}
