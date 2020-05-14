package com.lz.test;

import com.lz.tel.Camera;
import com.lz.tel.FourthPhone;
import com.lz.tel.INet;
import com.lz.tel.IPhoto;
import com.lz.tel.SmartWatch;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourthPhone phone = new FourthPhone();
		phone.call();
		phone.message();
		phone.vedio();
		phone.music();
		phone.photo();
		phone.game();
		phone.network();
		
		System.out.println("=============");
		IPhoto ip = new FourthPhone();
		ip.photo();
		
		ip = new Camera();
		ip.photo();
		System.out.println("=============");
		
		System.out.println(INet.TEMP);
		INet net = new SmartWatch();
		System.out.println(net.TEMP);
		SmartWatch sw = new SmartWatch();
		System.out.println(SmartWatch.TEMP);
		sw.connection();
		
		System.out.println("==================");
		INet n = new SmartWatch();
		n.network();
		
		IPhoto ip2 = new SmartWatch();
		ip2.connection();
		
		System.out.println("==================");
		
		INet net2 = new FourthPhone();
		net2.connection();
		
		IPhoto ip3 = new FourthPhone();
		ip3.connection();
	}

}
