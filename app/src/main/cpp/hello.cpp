#include <jni.h>

//
// Created by oocha on 2021/04/27.
//

extern "C" jstring JNICALL
Java_com_websarva_wings_android_ndksample_MainActivity_getMessage(JNIEnv *env, jobject thiz) {
    // TODO: implement getMessage()
    return env->NewStringUTF("hello world");
}