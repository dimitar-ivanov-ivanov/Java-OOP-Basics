package com.company.OnlineRadioDatabase.SongExceptions;

import com.company.OnlineRadioDatabase.Constants.ExceptionMessages;
import com.company.OnlineRadioDatabase.Constants.InvalidSongValueConstants;

public class InvalidSongNameException extends InvalidSongException {
    @Override
    public String getMessage() {
        return String.format(ExceptionMessages.INVALID_SONG_NAME,
                InvalidSongValueConstants.MIN_SONG_NAME_LENGTH,
                InvalidSongValueConstants.MAX_SONG_NAME_LENGTH);
    }
}
