package com.junchen.back.utils;

import java.util.UUID;

public class UUIDUtils {
	/**
	 * ���Ŀ¼���ļ����ظ�������
	 * ��������ļ���
	 * @param fileName
	 * @return
	 */
	public static String getUUIDFileName(String fileName){
		int x = fileName.lastIndexOf(".");
		String extion = fileName.substring(x);
		return UUID.randomUUID().toString().replaceAll("-", "")+extion;
	}
	/**
	 * ���һ��Ŀ¼��̫���ļ�������
	 * �����������Ŀ¼
	 * @param args
	 */
	public static String getPath(String uuidFileName){
		int code1 = uuidFileName.hashCode();
		int d1 = code1 & 0xf;
		int code2 = code1 >> 4;
		int d2 = code2 & 0xf;
		return d1+"/"+d2+"/";
	}
	
	public static void main(String[] args) {
		System.out.println(getUUIDFileName("vddd.txt"));
		System.out.println(getPath("vddd.txt"));
	}
}
