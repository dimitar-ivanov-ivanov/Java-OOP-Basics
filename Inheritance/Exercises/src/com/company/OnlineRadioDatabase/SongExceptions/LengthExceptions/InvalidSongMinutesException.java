package com.company.OnlineRadioDatabase.SongExceptions.LengthExceptions;

import com.company.OnlineRadioDatabase.Constants.ExceptionMessages;
import com.company.OnlineRadioDatabase.Constants.InvalidSongValueConstants;
import com.company.OnlineRadioDatabase.SongExceptions.LengthExceptions.InvalidSongLengthException;

public class InvalidSongMinutesException extends InvalidSongLengthException {
    @Override
    public String getMessage() {
        return String.format(ExceptionMessages.INVALID_SONG_LENGTH_MINUTES,
                InvalidSongValueConstants.MIN_SONG_MINUTES,
                InvalidSongValueConstants.MAX_SONG_MINUTES);
    }
}
