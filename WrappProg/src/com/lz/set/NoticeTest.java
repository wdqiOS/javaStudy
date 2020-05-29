package com.lz.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建对象
		Notice notice1 = new Notice(1, "欢迎来到北京", "管理员", new Date());
		Notice notice2 = new Notice(2, "导游引导", "老师", new Date());
		Notice notice3 = new Notice(3, "引导", "老师", new Date());

		// 添加公告
		System.out.println("----------------添加公告-------------------");
		ArrayList<Notice> noticeList = new ArrayList<Notice>();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);

		// 显示公告
		printNoticeEle(noticeList);

		// 指定位置添加新的公告
		Notice notice4 = new Notice(4, "在线编辑器", "管理员", new Date());
		noticeList.add(1, notice4);
		printNoticeEle(noticeList);

		// 删除指定的公告
		System.out.println("----------------删除指定的公告-------------------");
		noticeList.remove(2);
		printNoticeEle(noticeList);
		
		// 修改指定的公告
		System.out.println("----------------修改指定的公告-------------------");
		notice4.setTitle("Java在线编辑器");
		noticeList.set(1, notice4);
		printNoticeEle(noticeList);
		
	}

	// 输出公告数组中的内容
	public static void printNoticeEle(ArrayList<Notice> list) {
		System.out.println("公告的内容：");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ":" + ((Notice) (list.get(i))).getTitle());
		}
	}

}
