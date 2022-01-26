//[sdk](../../../index.md)/[com.robotemi.sdk.notification](../index.md)/[NotificationCallback](index.md)



# NotificationCallback  
 [androidJvm] open class [NotificationCallback](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

a class representing a notification id and the button number that was pressed used to return information to outside skills that requested showing a notification with button events

   


## Constructors  
  
| | |
|---|---|
| <a name="com.robotemi.sdk.notification/NotificationCallback/NotificationCallback/#java.lang.String#int/PointingToDeclaration/"></a>[NotificationCallback](-notification-callback.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/NotificationCallback/#java.lang.String#int/PointingToDeclaration/"></a> [androidJvm] open fun [NotificationCallback](-notification-callback.md)(@[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)()notificationId: [String](https://developer.android.com/reference/kotlin/java/lang/String.html), event: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))   <br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.notification/NotificationCallback/CREATOR/#/PointingToDeclaration/"></a>[CREATOR](-c-r-e-a-t-o-r.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/CREATOR/#/PointingToDeclaration/"></a> [androidJvm] val [CREATOR](-c-r-e-a-t-o-r.md): [Parcelable.Creator](https://developer.android.com/reference/kotlin/android/os/Parcelable.Creator.html)<[NotificationCallback](index.md)>   <br>|
| <a name="com.robotemi.sdk.notification/NotificationCallback/event/#/PointingToDeclaration/"></a>[event](event.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/event/#/PointingToDeclaration/"></a> [androidJvm] private open val [event](event.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.robotemi.sdk.notification/NotificationCallback/INVALID_EVENT/#/PointingToDeclaration/"></a>[INVALID_EVENT](-i-n-v-a-l-i-d_-e-v-e-n-t.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/INVALID_EVENT/#/PointingToDeclaration/"></a> [androidJvm] val [INVALID_EVENT](-i-n-v-a-l-i-d_-e-v-e-n-t.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.robotemi.sdk.notification/NotificationCallback/notificationId/#/PointingToDeclaration/"></a>[notificationId](notification-id.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/notificationId/#/PointingToDeclaration/"></a> [androidJvm] @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)()  <br>  <br>private open val [notificationId](notification-id.md): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)   <br>|
| <a name="com.robotemi.sdk.notification/NotificationCallback/PRIMARY_BUTTON_EVENT/#/PointingToDeclaration/"></a>[PRIMARY_BUTTON_EVENT](-p-r-i-m-a-r-y_-b-u-t-t-o-n_-e-v-e-n-t.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/PRIMARY_BUTTON_EVENT/#/PointingToDeclaration/"></a> [androidJvm] val [PRIMARY_BUTTON_EVENT](-p-r-i-m-a-r-y_-b-u-t-t-o-n_-e-v-e-n-t.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.robotemi.sdk.notification/NotificationCallback/SECONDARY_BUTTON_EVENT/#/PointingToDeclaration/"></a>[SECONDARY_BUTTON_EVENT](-s-e-c-o-n-d-a-r-y_-b-u-t-t-o-n_-e-v-e-n-t.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/SECONDARY_BUTTON_EVENT/#/PointingToDeclaration/"></a> [androidJvm] val [SECONDARY_BUTTON_EVENT](-s-e-c-o-n-d-a-r-y_-b-u-t-t-o-n_-e-v-e-n-t.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.robotemi.sdk.notification/NotificationCallback/TIMEOUT_EVENT/#/PointingToDeclaration/"></a>[TIMEOUT_EVENT](-t-i-m-e-o-u-t_-e-v-e-n-t.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/TIMEOUT_EVENT/#/PointingToDeclaration/"></a> [androidJvm] val [TIMEOUT_EVENT](-t-i-m-e-o-u-t_-e-v-e-n-t.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.notification/NotificationCallback/describeContents/#/PointingToDeclaration/"></a>[describeContents](describe-contents.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [describeContents](describe-contents.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.robotemi.sdk.notification/NotificationCallback/empty/#/PointingToDeclaration/"></a>[empty](empty.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/empty/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [empty](empty.md)(): [NotificationCallback](index.md)  <br><br><br>|
| <a name="com.robotemi.sdk.notification/NotificationCallback/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[writeToParcel](write-to-parcel.md)| <a name="com.robotemi.sdk.notification/NotificationCallback/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [writeToParcel](write-to-parcel.md)(dest: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|


## Inherited functions  
  
|  Name |  Summary | 
|---|---|
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../com.robotemi.sdk.model/-recent-call-model/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../com.robotemi.sdk.model/-recent-call-model/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[writeToParcel](../../com.robotemi.sdk.telepresence/-call-state/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../com.robotemi.sdk.telepresence/-call-state/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)(p: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|

