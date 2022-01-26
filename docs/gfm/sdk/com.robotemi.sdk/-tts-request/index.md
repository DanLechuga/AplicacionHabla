//[sdk](../../../index.md)/[com.robotemi.sdk](../index.md)/[TtsRequest](index.md)



# TtsRequest  
 [androidJvm] data class [TtsRequest](index.md)(**id**: [UUID](https://developer.android.com/reference/kotlin/java/util/UUID.html), **speech**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **packageName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **status**: [TtsRequest.Status](-status/index.md), **drawableBitmap**: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html)?, **isShowOnConversationLayer**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **language**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **showAnimationOnly**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)   


## Constructors  
  
| | |
|---|---|
| <a name="com.robotemi.sdk/TtsRequest/TtsRequest/#android.os.Parcel/PointingToDeclaration/"></a>[TtsRequest](-tts-request.md)| <a name="com.robotemi.sdk/TtsRequest/TtsRequest/#android.os.Parcel/PointingToDeclaration/"></a> [androidJvm] fun [TtsRequest](-tts-request.md)(source: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk/TtsRequest.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.robotemi.sdk/TtsRequest.Companion///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|
| <a name="com.robotemi.sdk/TtsRequest.Language///PointingToDeclaration/"></a>[Language](-language/index.md)| <a name="com.robotemi.sdk/TtsRequest.Language///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>enum [Language](-language/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[TtsRequest.Language](-language/index.md)>   <br><br><br>|
| <a name="com.robotemi.sdk/TtsRequest.Status///PointingToDeclaration/"></a>[Status](-status/index.md)| <a name="com.robotemi.sdk/TtsRequest.Status///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>enum [Status](-status/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[TtsRequest.Status](-status/index.md)>   <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk/TtsRequest/drawableBitmap/#/PointingToDeclaration/"></a>[drawableBitmap](drawable-bitmap.md)| <a name="com.robotemi.sdk/TtsRequest/drawableBitmap/#/PointingToDeclaration/"></a> [androidJvm] val [drawableBitmap](drawable-bitmap.md): [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html)? = null   <br>|
| <a name="com.robotemi.sdk/TtsRequest/id/#/PointingToDeclaration/"></a>[id](id.md)| <a name="com.robotemi.sdk/TtsRequest/id/#/PointingToDeclaration/"></a> [androidJvm] val [id](id.md): [UUID](https://developer.android.com/reference/kotlin/java/util/UUID.html)   <br>|
| <a name="com.robotemi.sdk/TtsRequest/isShowOnConversationLayer/#/PointingToDeclaration/"></a>[isShowOnConversationLayer](is-show-on-conversation-layer.md)| <a name="com.robotemi.sdk/TtsRequest/isShowOnConversationLayer/#/PointingToDeclaration/"></a> [androidJvm] val [isShowOnConversationLayer](is-show-on-conversation-layer.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)   <br>|
| <a name="com.robotemi.sdk/TtsRequest/language/#/PointingToDeclaration/"></a>[language](language.md)| <a name="com.robotemi.sdk/TtsRequest/language/#/PointingToDeclaration/"></a> [androidJvm] val [language](language.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0   <br>|
| <a name="com.robotemi.sdk/TtsRequest/packageName/#/PointingToDeclaration/"></a>[packageName](package-name.md)| <a name="com.robotemi.sdk/TtsRequest/packageName/#/PointingToDeclaration/"></a> [androidJvm] var [packageName](package-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|
| <a name="com.robotemi.sdk/TtsRequest/showAnimationOnly/#/PointingToDeclaration/"></a>[showAnimationOnly](show-animation-only.md)| <a name="com.robotemi.sdk/TtsRequest/showAnimationOnly/#/PointingToDeclaration/"></a> [androidJvm] val [showAnimationOnly](show-animation-only.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false   <br>|
| <a name="com.robotemi.sdk/TtsRequest/speech/#/PointingToDeclaration/"></a>[speech](speech.md)| <a name="com.robotemi.sdk/TtsRequest/speech/#/PointingToDeclaration/"></a> [androidJvm] val [speech](speech.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|
| <a name="com.robotemi.sdk/TtsRequest/status/#/PointingToDeclaration/"></a>[status](status.md)| <a name="com.robotemi.sdk/TtsRequest/status/#/PointingToDeclaration/"></a> [androidJvm] var [status](status.md): [TtsRequest.Status](-status/index.md)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk/TtsRequest/describeContents/#/PointingToDeclaration/"></a>[describeContents](describe-contents.md)| <a name="com.robotemi.sdk/TtsRequest/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [describeContents](describe-contents.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.robotemi.sdk/TtsRequest/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](equals.md)| <a name="com.robotemi.sdk/TtsRequest/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="com.robotemi.sdk/TtsRequest/hashCode/#/PointingToDeclaration/"></a>[hashCode](hash-code.md)| <a name="com.robotemi.sdk/TtsRequest/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.robotemi.sdk/TtsRequest/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](write-to-parcel.md)| <a name="com.robotemi.sdk/TtsRequest/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeToParcel](write-to-parcel.md)(dest: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|

