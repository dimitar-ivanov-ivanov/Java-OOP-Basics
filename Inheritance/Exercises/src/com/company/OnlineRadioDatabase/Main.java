package com.company.OnlineRadioDatabase;

import com.company.OnlineRadioDatabase.Models.Song;
import com.company.OnlineRadioDatabase.SongExceptions.InvalidSongException;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        List<Song> songs = getSongs();
        printTotalPlaylistLength(songs);
    }

    private static void printTotalPlaylistLength(List<Song> songs) {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        for (Song song :
                songs) {
            minutes += song.getMinutes();
            seconds += song.getSeconds();
        }

        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes >= 60) {
            hours = minutes / 60;
            minutes %= 60;
        }

        System.out.println("Playlist length: " + hours + "h " + minutes + "m " + seconds + "s");
    }

    private static List<Song> getSongs() {
        Scanner scanner = new Scanner(System.in);
        List<Song> songs = new ArrayList<>();
        int numberOfSong = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfSong; i++) {
            String[] args = scanner.nextLine().split(";|:");
            String artistName = args[0];
            String songName = args[1];
            int minutes = Integer.parseInt(args[2]);
            int seconds = Integer.parseInt(args[3]);

            try {
                Song song = new Song(artistName, songName, minutes, seconds);
                songs.add(song);
                System.out.println("Song added.");
            } catch (InvalidSongException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println("Songs added: " + songs.size());
        return songs;
    }
}
