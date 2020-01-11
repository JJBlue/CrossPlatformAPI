/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class crossplatformapi_jni_keyboard_NativeKeyboard */

#ifndef _Included_crossplatformapi_jni_keyboard_NativeKeyboard
#define _Included_crossplatformapi_jni_keyboard_NativeKeyboard
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     crossplatformapi_jni_keyboard_NativeKeyboard
 * Method:    registerHotKey
 * Signature: (III)Z
 */
JNIEXPORT jboolean JNICALL Java_crossplatformapi_jni_keyboard_NativeKeyboard_registerHotKey
  (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     crossplatformapi_jni_keyboard_NativeKeyboard
 * Method:    unregisterHotKey
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_crossplatformapi_jni_keyboard_NativeKeyboard_unregisterHotKey
  (JNIEnv *, jclass, jint);

/*
 * Class:     crossplatformapi_jni_keyboard_NativeKeyboard
 * Method:    getKeyState
 * Signature: (I)S
 */
JNIEXPORT jshort JNICALL Java_crossplatformapi_jni_keyboard_NativeKeyboard_getKeyState
  (JNIEnv *, jclass, jint);

/*
 * Class:     crossplatformapi_jni_keyboard_NativeKeyboard
 * Method:    pressKey
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_crossplatformapi_jni_keyboard_NativeKeyboard_pressKey
  (JNIEnv *, jclass, jint);

/*
 * Class:     crossplatformapi_jni_keyboard_NativeKeyboard
 * Method:    releaseKey
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_crossplatformapi_jni_keyboard_NativeKeyboard_releaseKey
  (JNIEnv *, jclass, jint);

/*
 * Class:     crossplatformapi_jni_keyboard_NativeKeyboard
 * Method:    getKeyboardLayout
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_crossplatformapi_jni_keyboard_NativeKeyboard_getKeyboardLayout
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
