//[sdk](../../../index.md)/[com.robotemi.sdk](../index.md)/[MediaObject](index.md)



# MediaObject  
 [androidJvm] open class [MediaObject](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html), [MediaContainer](../-media-container/index.md)   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk/MediaObject.MimeType///PointingToDeclaration/"></a>[MimeType](-mime-type/index.md)| <a name="com.robotemi.sdk/MediaObject.MimeType///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>enum [MimeType](-mime-type/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk/MediaObject/CREATOR/#/PointingToDeclaration/"></a>[CREATOR](-c-r-e-a-t-o-r.md)| <a name="com.robotemi.sdk/MediaObject/CREATOR/#/PointingToDeclaration/"></a> [androidJvm] val [CREATOR](-c-r-e-a-t-o-r.md): [Parcelable.Creator](https://developer.android.com/reference/kotlin/android/os/Parcelable.Creator.html)<[MediaObject](index.md)>   <br>|
| <a name="com.robotemi.sdk/MediaObject/file/#/PointingToDeclaration/"></a>[file](file.md)| <a name="com.robotemi.sdk/MediaObject/file/#/PointingToDeclaration/"></a> [androidJvm] private open val [file](file.md): [File](https://developer.android.com/reference/kotlin/java/io/File.html)   <br>|
| <a name="com.robotemi.sdk/MediaObject/localPath/#/PointingToDeclaration/"></a>[localPath](local-path.md)| <a name="com.robotemi.sdk/MediaObject/localPath/#/PointingToDeclaration/"></a> [androidJvm] open val [localPath](local-path.md): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)   <br>|
| <a name="com.robotemi.sdk/MediaObject/mimeType/#/PointingToDeclaration/"></a>[mimeType](mime-type.md)| <a name="com.robotemi.sdk/MediaObject/mimeType/#/PointingToDeclaration/"></a> [androidJvm] @()  <br>@(value = mimetype)  <br>  <br>open val [mimeType](mime-type.md): [MediaObject.MimeType](-mime-type/index.md)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk/MediaObject/create/#com.robotemi.sdk.MediaObject.MimeType#java.io.File/PointingToDeclaration/"></a>[create](create.md)| <a name="com.robotemi.sdk/MediaObject/create/#com.robotemi.sdk.MediaObject.MimeType#java.io.File/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [create](create.md)(mimeType: [MediaObject.MimeType](-mime-type/index.md), file: [File](https://developer.android.com/reference/kotlin/java/io/File.html)): [MediaObject](index.md)  <br><br><br>|
| <a name="com.robotemi.sdk/MediaObject/describeContents/#/PointingToDeclaration/"></a>[describeContents](describe-contents.md)| <a name="com.robotemi.sdk/MediaObject/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [describeContents](describe-contents.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.robotemi.sdk/MediaObject/getMediaUri/#/PointingToDeclaration/"></a>[getMediaUri](get-media-uri.md)| <a name="com.robotemi.sdk/MediaObject/getMediaUri/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [getMediaUri](get-media-uri.md)(): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)  <br><br><br>|
| <a name="com.robotemi.sdk/MediaObject/setMediaUri/#java.lang.String/PointingToDeclaration/"></a>[setMediaUri](set-media-uri.md)| <a name="com.robotemi.sdk/MediaObject/setMediaUri/#java.lang.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [setMediaUri](set-media-uri.md)(uri: [String](https://developer.android.com/reference/kotlin/java/lang/String.html))  <br><br><br>|
| <a name="com.robotemi.sdk/MediaObject/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[writeToParcel](write-to-parcel.md)| <a name="com.robotemi.sdk/MediaObject/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [writeToParcel](write-to-parcel.md)(dest: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|


## Inherited functions  
  
|  Name |  Summary | 
|---|---|
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../com.robotemi.sdk.model/-recent-call-model/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../com.robotemi.sdk.model/-recent-call-model/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[writeToParcel](../../com.robotemi.sdk.telepresence/-call-state/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../com.robotemi.sdk.telepresence/-call-state/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)(p: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|

