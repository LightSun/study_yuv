package com.heaven7.android.image;

public class YuvProcessor{

    private ImageHandleInfo info = new ImageHandleInfo();

    //image src and dst info
    public YuvProcessor(int width, int height, int dst_width, int dst_height){

    }
    //convert, scale, align, scale
    public static void process(byte[] srcData, int srcW, int srcH, byte[] dst, int dstW, int dstH){

    }

    private static native void nProcess(byte[] srcData, int srcW, int srcH, byte[] dst, int dstW, int dstH, long infoPtr);
}
