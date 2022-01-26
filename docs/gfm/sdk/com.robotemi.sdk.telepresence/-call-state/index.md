//[sdk](../../../index.md)/[com.robotemi.sdk.telepresence](../index.md)/[CallState](index.md)



# CallState  
 [androidJvm] open class [CallState](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)   


## Constructors  
  
| | |
|---|---|
| <a name="com.robotemi.sdk.telepresence/CallState/CallState/#java.lang.String#com.robotemi.sdk.telepresence.CallState.State/PointingToDeclaration/"></a>[CallState](-call-state.md)| <a name="com.robotemi.sdk.telepresence/CallState/CallState/#java.lang.String#com.robotemi.sdk.telepresence.CallState.State/PointingToDeclaration/"></a> [androidJvm] open fun [CallState](-call-state.md)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)()sessionId: [String](https://developer.android.com/reference/kotlin/java/lang/String.html), state: [CallState.State](-state/index.md))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.telepresence/CallState.State///PointingToDeclaration/"></a>[State](-state/index.md)| <a name="com.robotemi.sdk.telepresence/CallState.State///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>enum [State](-state/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.telepresence/CallState/CREATOR/#/PointingToDeclaration/"></a>[CREATOR](-c-r-e-a-t-o-r.md)| <a name="com.robotemi.sdk.telepresence/CallState/CREATOR/#/PointingToDeclaration/"></a> [androidJvm] val [CREATOR](-c-r-e-a-t-o-r.md): [Parcelable.Creator](https://developer.android.com/reference/kotlin/android/os/Parcelable.Creator.html)<[CallState](index.md)>   <br>|
| <a name="com.robotemi.sdk.telepresence/CallState/sessionId/#/PointingToDeclaration/"></a>[sessionId](session-id.md)| <a name="com.robotemi.sdk.telepresence/CallState/sessionId/#/PointingToDeclaration/"></a> [androidJvm] @[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)()  <br>  <br>private val [sessionId](session-id.md): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)   <br>|
| <a name="com.robotemi.sdk.telepresence/CallState/state/#/PointingToDeclaration/"></a>[state](state.md)| <a name="com.robotemi.sdk.telepresence/CallState/state/#/PointingToDeclaration/"></a> [androidJvm] private val [state](state.md): [CallState.State](-state/index.md)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.telepresence/CallState/describeContents/#/PointingToDeclaration/"></a>[describeContents](describe-contents.md)| <a name="com.robotemi.sdk.telepresence/CallState/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [describeContents](describe-contents.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.robotemi.sdk.telepresence/CallState/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.robotemi.sdk.telepresence/CallState/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)()  <br>  <br>open fun [toString](to-string.md)(): [String](https://developer.android.com/reference/kotlin/java/lang/String.html)  <br><br><br>|
| <a name="com.robotemi.sdk.telepresence/CallState/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[writeToParcel](write-to-parcel.md)| <a name="com.robotemi.sdk.telepresence/CallState/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [writeToParcel](write-to-parcel.md)(dest: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|


## Inherited functions  
  
|  Name |  Summary | 
|---|---|
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../com.robotemi.sdk.model/-recent-call-model/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../com.robotemi.sdk.model/-recent-call-model/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[writeToParcel](index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2100633493)(p: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|

