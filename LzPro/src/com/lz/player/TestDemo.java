package com.lz.player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemo {
	
	// 对歌曲类Song进行测试
	public void testSong() {
		Song song1 = new Song("001", "两只老虎", "小太阳合唱团");
		Song song2 = new Song("002", "小燕子", "风车合唱团");
		Song song3 = new Song("003", "茉莉花", "彩虹合唱团");
		Song song4 = new Song("003", "茉莉花", "彩虹合唱团");
		System.out.println(song1);
		// 测试song1和song3这两个对象是否相等
		System.out.println("song1==song3?"+(song1.equals(song3)));
		// 测试song3和song4这两个对象是否相等
		System.out.println("song3==song4?"+(song3.equals(song4)));
		System.out.println("song3==song4?"+(song3==song4));
	}
	
	// 对播放列表类PlayList进行测试
	public void testPlayList() {
		// 定义几个Song类的对象，添加到播放列表中
		Song song1 = new Song("001", "两只老虎", "小太阳合唱团");
		Song song2 = new Song("002", "小燕子", "风车合唱团");
		Song song3 = new Song("003", "茉莉花", "彩虹合唱团");
		Song song4 = new Song("003", "茉莉花", "彩虹合唱团");
		
		// 创建一个播放列表对象
		PlayList mainPlayList = new PlayList("主播放列表");
		mainPlayList.addToPLayList(song1);
		mainPlayList.addToPLayList(song2);
		mainPlayList.addToPLayList(song3);
		mainPlayList.addToPLayList(song4);
		// 显示播放列表内容
		mainPlayList.displayAllSong();
		
		// 通过id查询歌曲信息
		Song song = mainPlayList.searchSongById("001");
		if(song!= null) {
			System.out.println("根据id查询的歌曲信息为：");
			System.out.println(song);
		} else {
			System.out.println("该歌曲不存在!");
		}
		// 通过名称查询歌曲信息
		song = mainPlayList.searchSongByName("小燕子");
		if(song!=null) {
			System.out.println("根据name查询的歌曲信息为：");
			System.out.println(song);
		} else {
			System.out.println("该歌曲不存在!");
		}
		// 修改歌曲信息
		Song songUpdate = new Song("005", "蜗牛与黄鹂鸟", "小太阳");
		mainPlayList.updateSong("003", songUpdate);
		mainPlayList.displayAllSong();
		
		// 删除歌曲信息
		mainPlayList.deleteSong("005");
		mainPlayList.displayAllSong();
		
	}
	
	// 测试播放列表集合类
	public void testPlayListCollection() {
		Song song1 = new Song("001", "两只老虎", "小太阳合唱团");
		Song song2 = new Song("002", "小燕子", "风车合唱团");
		Song song3 = new Song("003", "茉莉花", "彩虹合唱团");
		// 创建主播放列表
		PlayList mainPlayList = new PlayList("主播放列表");
		// 将歌曲添加到主播放列表中
		mainPlayList.addToPLayList(song1);
		mainPlayList.addToPLayList(song2);
		mainPlayList.addToPLayList(song3);
		
		// 定义一个新的播放列表，从主播放列表中添加歌曲进来
		PlayList favouritePlayList = new PlayList("最喜欢的歌曲");
		favouritePlayList.addToPLayList(mainPlayList.getMusicList().get(0));
		favouritePlayList.addToPLayList(mainPlayList.getMusicList().get(1));
		favouritePlayList.displayAllSong();
		
		// 将两个播放列表添加到播放列表集合中
		PlayListCollection plc = new PlayListCollection();
		plc.addPlayList(mainPlayList);
		plc.addPlayList(favouritePlayList);
		plc.displayListName();
		// 根据播放列表名字查询播放列表信息，并显示所有歌曲
		PlayList pl = plc.searchPlayListByName("最喜欢的歌曲");
		pl.displayAllSong();
		// 删除播放列表信息
		System.out.println("删除前：");
		plc.displayListName();
		plc.deletePlayList(favouritePlayList);
		System.out.println("删除后：");
		plc.displayListName();
	}
	
	// 主菜单
	public void mainMenu() {
		System.out.println("*******************************");
		System.out.println("			**主菜单**			");
		System.out.println("			1--播放列表管理		");
		System.out.println("			2--播放器管理		");
		System.out.println("			0--退出		");
		System.out.println("*******************************");
	}
	// 播放列表管理菜单
	public void playListMenu() {
		System.out.println("******************************************");
		System.out.println("	**播放列表管理**	");
		System.out.println("	1--将歌曲添加到主播放列表	");
		System.out.println("	2--将歌曲添加到普通播放列表	");
		System.out.println("	3--通过歌曲id查询播放列表中的歌曲	");
		System.out.println("	4--通过歌曲的名称查询播放列表中的歌曲		");
		System.out.println("	5--修改播放列表中的歌曲		");
		System.out.println("	6--删除播放列表中的歌曲		");
		System.out.println("	7--显示播放列表中的所有歌曲		");
		System.out.println("	9--返回上一级菜单		");
		System.out.println("*****************************************");
	}
	// 播放器菜单
	public void playerMenu() {
		System.out.println("******************************************");
		System.out.println("	**播放器管理**	");
		System.out.println("	1--向播放器添加播放列表	");
		System.out.println("	2--从播放器删除播放列表	");
		System.out.println("	3--通过名字查询播放列表信息	");
		System.out.println("	4--显示所有播放列表名称		");
		System.out.println("	9--返回上一级菜单		");
		System.out.println("*****************************************");
	}
	// 主流程
	public void test() {
		TestDemo td = new TestDemo();
		Scanner sc = new Scanner(System.in);
		int input=0,input1 = 0,input2=0;
		// 创建一个播放列表容器（播放器）
		PlayListCollection plc = new PlayListCollection();
		// 创建主播放列表
		PlayList mainPlayList = new PlayList("主播放列表");
		// 将主播放列表添加到播放器
		plc.addPlayList(mainPlayList);
		PlayList favouritePlayList = null;
		while(true) {
			td.mainMenu();
			System.out.println("请输入对应数字进行操作：");
			try {
				input = sc.nextInt();
			} catch(InputMismatchException e) {
//				e.printStackTrace();
				sc.next();
				System.out.println("输入格式不正确！请重新输入");
				continue;
			}
			
			if(input == 0) {
				break;
			}
			switch(input) {
			case 1:
				// 播放列表管理
				while(true) {
					td.playListMenu();
					System.out.println("请输入对应数字对播放列表进行管理：");
					input1 = sc.nextInt();
					if(input1 == 9) {
						break;
					}
					switch(input1) {
					case 1: 
						System.out.println("将歌曲添加到主播放列表");
						System.out.println("请输入要添加的歌曲的数量：");
						int count = sc.nextInt();
						for(int i = 1; i <= count; i++) {
							System.out.println("请输入第"+i+"首歌曲：");
							System.out.println("请输入歌曲的id：");
							String strId = sc.next();
							System.out.println("请输入歌曲的名称：");
							String strName = sc.next();
							System.out.println("请输入演唱者：");
							String strSinger = sc.next();
							// 创建歌曲类对象
							Song song = new Song(strId, strName, strSinger);
							mainPlayList.addToPLayList(song);
						}
					break;
					case 2: 
						System.out.println("将歌曲添加到普通播放列表");
						System.out.println("请输入要添加的播放列表名称：");
						String sName = sc.next();
						// 根据名称判断播放列表是否在播放器中
						favouritePlayList = plc.searchPlayListByName(sName);
						if(favouritePlayList == null) {
							System.out.println("该播放列表不存在，请先将播放列表添加到播放器中！");
						} else {
							System.out.println("请输入要添加的歌曲的数量：");
							int count1 = sc.nextInt();
							for(int i = 1; i <= count1; i++) {
								System.out.println("请输入第"+i+"首歌曲：");
								System.out.println("请输入歌曲id：");
								String strId = sc.next();
								// 判断该id的歌曲是否在主播放列表存在
								Song song = mainPlayList.searchSongById(strId);
								if(song == null) {
									// 如果歌曲不存在，则创建新的添加，并且添加到主播放列表
									System.out.println("该歌曲在主播放列表不存在，继续输入歌曲的其他信息！");
									System.out.println("请输入歌曲名称：");
									String strName = sc.next();
									System.out.println("请输入演唱者：");
									String strSinger = sc.next();
									// 创建一个Song类对象
									Song song1 = new Song(strId, strName, strSinger);
									// 分别将歌曲添加到普通播放列表和朱播放列表
									favouritePlayList.addToPLayList(song1);
									mainPlayList.addToPLayList(song1);
								} else {
									// 如果歌曲存在于主播放列表，则直接添加到现在的播放列表
									favouritePlayList.addToPLayList(song);
								}
							}
							// 显示播放列表中的歌曲信息
							System.out.println("主播放列表");
							mainPlayList.displayAllSong();
							System.out.println("普通播放列表");
							favouritePlayList.displayAllSong();
						}
					
					break;
					case 3: 
						System.out.println("通过歌曲id查询播放列表中的歌曲");
						System.out.println("请输入要查询的播放列表名称：");
						String strPlayListName1 = sc.next();
						// 查询播放列表是否存在
						PlayList pl = plc.searchPlayListByName(strPlayListName1);
						if(pl == null) {
							System.out.println("该播放列表不存在！");
							break;
						} else {
							System.out.println("请输入要查询的歌曲id：");
							String strId = sc.next();
							Song s = pl.searchSongById(strId);
							if(s == null) {
								System.out.println("该歌曲在播放列表"+ strPlayListName1 +"不存在！");
							} else {
								System.out.println("该歌曲的信息为：\n"+s);
							}
						}
						
						break;
					case 4: 
						System.out.println("通过歌曲名称查询播放列表中的歌曲");
						System.out.println("请输入要查询的播放列表名称：");
						String strPlayListName2 = sc.next();
						// 查询播放列表是否存在
						PlayList pl2 = plc.searchPlayListByName(strPlayListName2);
						if(pl2 == null) {
							System.out.println("该播放列表不存在！");
							break;
						} else {
							System.out.println("请输入要查询的歌曲名称：");
							String strName = sc.next();
							Song s = pl2.searchSongByName(strName);
							if(s == null) {
								System.out.println("该歌曲在播放列表"+ strPlayListName2 +"不存在！");
							} else {
								System.out.println("该歌曲的信息为：\n"+s);
							}
						}
						
						break;
					case 5: 
						System.out.println("修改播放列表中的歌曲");
						
						break;
					case 6: System.out.println("删除播放列表中的歌曲");break;
					case 7: 
						System.out.println("显示播放列表中的所有歌曲");
						System.out.println("请输入要查询的播放列表名称：");
						String strPlayListName7 = sc.next();
						PlayList pl7 = plc.searchPlayListByName(strPlayListName7);
						if(pl7 == null) {
							System.out.println("查询的播放列表不存在！");
						}else {
							pl7.displayAllSong();
						}
						break;
					default:System.out.println("该数字没有对应的操作！");
						break;
						
					}
				}
				break;
			case 2:
				// 播放器管理
				while(true) {
					td.playerMenu();
					System.out.println("请输入对应数字对播放器进行管理：");
					input2 = sc.nextInt();
					if(input2 == 9) {
						break;
					}
					switch(input2) {
					case 1: 
						System.out.println("向播放器添加播放列表");
						System.out.println("输入要添加的播放列表名称：");
						String playerName = sc.next();
						// 创建一个新的播放列表对象
						favouritePlayList = new PlayList(playerName);
						// 将播放列表添加到播放器Map
						plc.addPlayList(favouritePlayList);
						break;
					case 2: 
						System.out.println("从播放器删除播放列表");
						System.out.println("请输入要删除的播放列表名称：");
						String strPlayListName = sc.next();
						// 
						if(strPlayListName.equals("主播放列表")) {
							System.out.println("主播放列表不能删除！");
							break;
						} 
						// 查询播放列表是否存在
						PlayList pl = plc.searchPlayListByName(strPlayListName);
						if(pl == null) {
							System.out.println("该播放列表不存在！");
						} else {
							// 存在删除
							plc.deletePlayList(pl);
						}
						break;
					case 3: 
						System.out.println("通通过名字查询播放列表信息");
						System.out.println("请输入要查询的播放列表名称：");
						String strPlayList1 = sc.next();
						PlayList pl2 = plc.searchPlayListByName(strPlayList1);
						if(pl2 == null) {
							System.out.println("该播放列表不存在！");
						} else {
							// 显示该播放列表名称及其中的所有歌曲
							System.out.println("该播放列表存在！");
							System.out.println("播放列表名称为："+strPlayList1);
							pl2.displayAllSong();
						}
						break;
					case 4: 
						System.out.println("显示所有播放列表名称");
						System.out.println("所有播放列表名称为：");
						plc.displayListName();
						break;
					default:
						System.out.println("该数字没有对应的操作！");
						break;
					
					}
				}
				break;
			default:
				System.out.println("该数字没有对应的操作！");
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		TestDemo td = new TestDemo();
//		td.testSong();
//		td.testPlayList();
//		td.testPlayListCollection();
		td.test();
	}

}
