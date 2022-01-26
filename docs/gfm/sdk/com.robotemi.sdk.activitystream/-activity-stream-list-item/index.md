//[sdk](../../../index.md)/[com.robotemi.sdk.activitystream](../index.md)/[ActivityStreamListItem](index.md)



# ActivityStreamListItem  
 [androidJvm] open class [ActivityStreamListItem](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html), [MediaContainer](../../com.robotemi.sdk/-media-container/index.md)   


## Constructors  
  
| | |
|---|---|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/ActivityStreamListItem/#java.lang.String#java.lang.String#java.io.File#java.lang.String#java.lang.String#com.robotemi.sdk.MediaObject.MimeType/PointingToDeclaration/"></a>[ActivityStreamListItem](-activity-stream-list-item.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/ActivityStreamListItem/#java.lang.String#java.lang.String#java.io.File#java.lang.String#java.lang.String#com.robotemi.sdk.MediaObject.MimeType/PointingToDeclaration/"></a> [androidJvm] open fun [ActivityStreamListItem](-activity-stream-list-item.md)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)()title: [String](https://developer.android.com/reference/kotlin/java/lang/String.html), @[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)()message: [String](https://developer.android.com/reference/kotlin/java/lang/String.html), @[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)()file: [File](https://developer.android.com/reference/kotlin/java/io/File.html), @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)()url: [String](https://developer.android.com/reference/kotlin/java/lang/String.html), @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)()date: [String](https://developer.android.com/reference/kotlin/java/lang/String.html), @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)()mimeType: [MediaObject.MimeType](../../com.robotemi.sdk/-media-object/-mime-type/index.md))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem.Builder///PointingToDeclaration/"></a>[Builder](-builder/index.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem.Builder///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open class [Builder](-builder/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/CREATOR/#/PointingToDeclaration/"></a>[CREATOR](-c-r-e-a-t-o-r.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/CREATOR/#/PointingToDeclaration/"></a> [androidJvm] val [CREATOR](-c-r-e-a-t-o-r.md): [Parcelable.Creator](https://developer.android.com/reference/kotlin/android/os/Parcelable.Creator.html)<[ActivityStreamListItem](index.md)>   <br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/date/#/PointingToDeclaration/"></a>[date](date.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/date/#/PointingToDeclaration/"></a> [androidJvm] @()  <br>@(value = date)  <br>  <br>private open val [date](date.md): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)   <br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/file/#/PointingToDeclaration/"></a>[file](file.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/file/#/PointingToDeclaration/"></a> [androidJvm] private open val [file](file.md): [File](https://developer.android.com/reference/kotlin/java/io/File.html)   <br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/isFileProvided/#/PointingToDeclaration/"></a>[isFileProvided](is-file-provided.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/isFileProvided/#/PointingToDeclaration/"></a> [androidJvm] private open val [isFileProvided](is-file-provided.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)   <br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/localPath/#/PointingToDeclaration/"></a>[localPath](local-path.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/localPath/#/PointingToDeclaration/"></a> [androidJvm] private open val [localPath](local-path.md): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)   <br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/mediaUri/#/PointingToDeclaration/"></a>[mediaUri](media-uri.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/mediaUri/#/PointingToDeclaration/"></a> [androidJvm] @()  <br>@(value = mediaUrl)  <br>  <br>private open var [mediaUri](media-uri.md): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)   <br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/message/#/PointingToDeclaration/"></a>[message](message.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/message/#/PointingToDeclaration/"></a> [androidJvm] @()  <br>@(value = message)  <br>  <br>private open val [message](message.md): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)   <br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/mimeType/#/PointingToDeclaration/"></a>[mimeType](mime-type.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/mimeType/#/PointingToDeclaration/"></a> [androidJvm] @()  <br>@(value = mimetype)  <br>  <br>private open val [mimeType](mime-type.md): [MediaObject.MimeType](../../com.robotemi.sdk/-media-object/-mime-type/index.md)   <br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/title/#/PointingToDeclaration/"></a>[title](title.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/title/#/PointingToDeclaration/"></a> [androidJvm] @()  <br>@(value = title)  <br>  <br>private open val [title](title.md): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)   <br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/url/#/PointingToDeclaration/"></a>[url](url.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/url/#/PointingToDeclaration/"></a> [androidJvm] @()  <br>@(value = url)  <br>  <br>private open val [url](url.md): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/builder/#/PointingToDeclaration/"></a>[builder](builder.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/builder/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [builder](builder.md)(): [ActivityStreamListItem.Builder](-builder/index.md)  <br><br><br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/describeContents/#/PointingToDeclaration/"></a>[describeContents](describe-contents.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [describeContents](describe-contents.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[writeToParcel](write-to-parcel.md)| <a name="com.robotemi.sdk.activitystream/ActivityStreamListItem/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [writeToParcel](write-to-parcel.md)(dest: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|


## Inherited functions  
  
|  Name |  Summary | 
|---|---|
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../com.robotemi.sdk.model/-recent-call-model/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../com.robotemi.sdk.model/-recent-call-model/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[writeToParcel](../../com.robotemi.sdk.telepresence/-call-state/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../com.robotemi.sdk.telepresence/-call-state/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)(p: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|

