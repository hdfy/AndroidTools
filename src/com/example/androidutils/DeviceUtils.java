package com.example.androidutils;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

public class DeviceUtils {

	/**
	 * 电信号段:133/153/180/181/189/177； 联通号段:130/131/132/155/156/185/186/145/176；
	 * 移动号段
	 * ：134/135/136/137/138/139/150/151/152/157/158/159/182/183/184/187/188/147
	 * /178。
	 * 
	 * @author hdfy
	 * @param number
	 * @return
	 */
	public static boolean isMobileNumber(String number) {
		String[] numberHeads = { "133", "153", "180", "181", "189", "177",
				"130", "131", "132", "155", "156", "185", "186", "145", "176",
				"134", "135", "136", "137", "138", "139", "150", "151", "152",
				"157", "158", "159", "182", "183", "184", "187", "188", "147",
				"178" };
		if (TextUtils.isEmpty(number)) {
			return false;
		}
		for (String numberHead : numberHeads) {
			if (number.startsWith(numberHead)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return deviceID (IMEI)
	 * 添加权限：android.permission.READ_PHONE_STATE
	 */
	public static String getDeviceID(Context context) {
		TelephonyManager telephonyManager = (TelephonyManager) context
				.getSystemService(Context.TELEPHONY_SERVICE);
		String deviceID = telephonyManager.getDeviceId();
		return deviceID;
	}
	
	/**
	 * @return phoneNumber
	 * 添加权限：android.permission.READ_PHONE_STATE
	 * 也有可能获取不到本机号码（移动运营商没有把手机号码的数据写入到sim卡中）
	 * 解决办法：给运营商发送短信，然后监听得到此短信，然后分解字符串那么就可以得到手机号了
	 */
	public static String getPhoneNumber(Context context) {
		TelephonyManager telephonyManager = (TelephonyManager) context
				.getSystemService(Context.TELEPHONY_SERVICE);
		String phoneNumber = telephonyManager.getLine1Number();//获取本机号码
		return phoneNumber;
	}
}
