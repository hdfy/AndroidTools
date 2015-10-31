package com.example.androidutils;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

public class DeviceUtils {

	/**
	 * ���źŶ�:133/153/180/181/189/177�� ��ͨ�Ŷ�:130/131/132/155/156/185/186/145/176��
	 * �ƶ��Ŷ�
	 * ��134/135/136/137/138/139/150/151/152/157/158/159/182/183/184/187/188/147
	 * /178��
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
	 * ���Ȩ�ޣ�android.permission.READ_PHONE_STATE
	 */
	public static String getDeviceID(Context context) {
		TelephonyManager telephonyManager = (TelephonyManager) context
				.getSystemService(Context.TELEPHONY_SERVICE);
		String deviceID = telephonyManager.getDeviceId();
		return deviceID;
	}
	
	/**
	 * @return phoneNumber
	 * ���Ȩ�ޣ�android.permission.READ_PHONE_STATE
	 * Ҳ�п��ܻ�ȡ�����������루�ƶ���Ӫ��û�а��ֻ����������д�뵽sim���У�
	 * ����취������Ӫ�̷��Ͷ��ţ�Ȼ������õ��˶��ţ�Ȼ��ֽ��ַ�����ô�Ϳ��Եõ��ֻ�����
	 */
	public static String getPhoneNumber(Context context) {
		TelephonyManager telephonyManager = (TelephonyManager) context
				.getSystemService(Context.TELEPHONY_SERVICE);
		String phoneNumber = telephonyManager.getLine1Number();//��ȡ��������
		return phoneNumber;
	}
}
