package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {
	private List<Song> list = new ArrayList<Song>();

	public SongRepository() {
		super();
		addSong(new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "1975"));
		addSong(new Song(2, "Imagine", "John Lennon", "Imagine", "1971"));
	}

	public List<Song> getAllSongs() {
		return list;
	}

	public Song getSongById(Integer id) {
		// TODO
		return list.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
	}

	public void addSong(Song s) {
		// TODO
		list.add(s);
	}

	public void updateSong(Song s) {
		// TODO
		list.stream().filter(t -> t.getId().equals(s.getId())).findFirst().ifPresent(t -> {
			t.setAlbum(s.getAlbum());
			t.setAnoLancamento(s.getAnoLancamento());
			t.setArtista(s.getArtista());
			t.setNome(s.getNome());
		});
	}

	public void removeSong(Song s) {
		// TODO
		list.remove(list.stream().filter(t -> t.getId().equals(s.getId())).findFirst().orElseThrow());
	}
}