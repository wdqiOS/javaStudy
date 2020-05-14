package com.lz.tel;

/**
 * 具有照相能力的接口
 * 
 * @author wangdaqiang
 *
 */
public interface IPhoto {
	// 具有拍照的功能
	public void photo();
	
	default void connection() {
		System.out.println("我是IPhoto接口中的默认连接");
	}
}
