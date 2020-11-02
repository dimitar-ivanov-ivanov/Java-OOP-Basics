package com.company.OnlineRadioDatabase.SongExceptions;

import com.company.OnlineRadioDatabase.Constants.ExceptionMessages;
import com.company.OnlineRadioDatabase.Constants.InvalidSongValueConstants;

public class InvalidArtistException extends InvalidSongException {
    @Override
    public String getMessage() {
        return String.format(ExceptionMessages.INVALID_ARTIST_NAME,
                InvalidSongValueConstants.MIN_ARTIST_NAME_LENGTH,
                InvalidSongValueConstants.MAX_ARTIST_NAME_LENGTH);
    }
}
