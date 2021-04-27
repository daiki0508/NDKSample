#include <jni.h>
#include <string>
#include <string.h>
//
// Created by oocha on 2021/04/27.
//

extern "C" JNIEXPORT jstring JNICALL
Java_com_websarva_wings_android_ndksample_MainActivity_getMessage(JNIEnv *env, jobject thiz,jstring j_name) {
    // TODO: implement getMessage()
    const char *name = env->GetStringUTFChars(j_name, 0);
    std::string msg = "Hello ";
    msg+= name;
    msg += "\nWelcome to JNI World!!";
    return env->NewStringUTF(msg.c_str());
}