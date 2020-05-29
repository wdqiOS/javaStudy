package com.lz.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 播放列表
 * @author wangdaqiang
 *
 */
public class PlayList {
	private String playListName; // 播放列表名称
	private List<Song> musicList; // 播放列表中的歌曲集合
	
	/**
	 * 构造方法
	 * @param playListName 播放列表名称
	 */
	public PlayList(String playListName) {
		this.setPlayListName(playListName);
		musicList = new ArrayList<Song>();
	}
	
	/**
	 * 将歌曲添加到播放列表
	 * @param song 要添加的歌曲
	 */
	public void addToPLayList(Song song) {
		// 要排除重复添加的情况
		boolean flag = false; // 判断播放列表中是否有重复歌曲
		for(Song song1: musicList) {
			if(song1.equals(song)) {
				flag = true; break;
			}
		}
		
		if(flag) {
			System.out.println("该歌曲已经存在于播放列表中，添加失败！");
			System.out.println("重复歌曲为："+song);
		} else {
			musicList.add(song);
		}
	}
	/**
	 * 通过歌曲id查询
	 * @param id 歌曲id
	 * @return 查询到的歌曲信息
	 */
	public Song searchSongById(String id) {
		Song song = null;
		// id是唯一的
		for(Song song1: musicList) {
			if(song1.getId().equals(id)) {
				// 如果相等，表示找到了
				song = song1; break;
			}
		}
		return song;
	}
	
	/**
	 * 通过歌曲名称查询
	 * @param name 歌曲名称
	 * @return 查询到的歌曲信息
	 */
	public Song searchSongByName(String name) {
		Song song = null;
		for(Song song1:musicList) {
			if(song1.getName().equals(name)) {
				// 如果相等，表示找到了
				song = song1;
				break;
			}
		}
		return song;
	}
	
	/**
	 * 修改播放列表中的歌曲信息
	 * @param id 要修改的歌曲id
	 * @param song 新的歌曲信息
	 */
	public void updateSong(String id, Song song) {
		// 歌曲id查询到相关的歌曲信息，然后进行修改
		Song song1 = searchSongById(id);
		if (song1 ==null) {
			System.out.println("没有找到id为"+id+"对应的歌曲信息！");
		} else {
			// 先移除原来的信息，然后再重新添加
			musicList.remove(song1);
			musicList.add(song);
			System.out.println("修改成功!");
		}
	}
	
	/**
	 * 删除播放列表中的指定歌曲信息
	 * @param id 歌曲id
	 */
	public void deleteSong(String id) {
		Song song1 = searchSongById(id);
		if(song1 != null) {
			musicList.remove(song1);
		} else {
			System.out.println("没有找到id为"+id+"对应的歌曲信息！");
		}
	}
	
	/**
	 * 显示播放列表中的所有歌曲
	 */
	public void displayAllSong() {
		System.out.println("播放列表中的所有歌曲为：");
		for(Song song:musicList) {
			System.out.println(song);
		}
	}
	

	// setter/getter方法
	public String getPlayListName() {
		return playListName;
	}

	public void setPlayListName(String playListName) {
		this.playListName = playListName;
	}

	public List<Song> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Song> musicList) {
		this.musicList = musicList;
	}
	
}
