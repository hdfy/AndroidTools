package com.example.androidutils;

import android.text.TextUtils;

public class DeviceUtils {

    /**
     * 电信号段:133/153/180/181/189/177；
     * 联通号段:130/131/132/155/156/185/186/145/176；
     * 移动号段：134/135/136/137/138/139/150/151/152/157/158/159/182/183/184/187/188/147/178。
     * 
     * @author hdfy
     * @param number
     * @return
     */
	public static boolean isMobileNumber(String number){
		String[] numberHeads = {
				"133","153","180","181","189","177",
				"130","131","132","155","156","185",
				"186","145","176","134","135","136",
				"137","138","139","150","151","152",
				"157","158","159","182","183","184",
				"187","188","147","178"
		};
		if(TextUtils.isEmpty(number)){
			return false;
		}
		for (String numberHead : numberHeads) {
			if(number.startsWith(numberHead)){
				return true;
			}
		}
		return false;
	}
}
