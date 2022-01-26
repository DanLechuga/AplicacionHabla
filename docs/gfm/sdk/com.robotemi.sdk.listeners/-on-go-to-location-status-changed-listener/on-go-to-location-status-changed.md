//[sdk](../../../index.md)/[com.robotemi.sdk.listeners](../index.md)/[OnGoToLocationStatusChangedListener](index.md)/[onGoToLocationStatusChanged](on-go-to-location-status-changed.md)



# onGoToLocationStatusChanged  
[androidJvm]  
Content  
abstract fun [onGoToLocationStatusChanged](on-go-to-location-status-changed.md)(location: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), status: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), descriptionId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  
More info  


Listen for status changes during 'go to location'.



Available statuses:

<ul><li>[OnGoToLocationStatusChangedListener.START](-companion/-s-t-a-r-t.md)</li><li>[OnGoToLocationStatusChangedListener.CALCULATING](-companion/-c-a-l-c-u-l-a-t-i-n-g.md)</li><li>[OnGoToLocationStatusChangedListener.GOING](-companion/-g-o-i-n-g.md)</li><li>[OnGoToLocationStatusChangedListener.COMPLETE](-companion/-c-o-m-p-l-e-t-e.md)</li><li>[OnGoToLocationStatusChangedListener.ABORT](-companion/-a-b-o-r-t.md)</li><li>[OnGoToLocationStatusChangedListener.REPOSING](-companion/-r-e-p-o-s-i-n-g.md)</li></ul>

## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.robotemi.sdk.listeners/OnGoToLocationStatusChangedListener/onGoToLocationStatusChanged/#kotlin.String#kotlin.String#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>location| <a name="com.robotemi.sdk.listeners/OnGoToLocationStatusChangedListener/onGoToLocationStatusChanged/#kotlin.String#kotlin.String#kotlin.Int#kotlin.String/PointingToDeclaration/"></a><br><br>Location of GoTo response.<br><br>|
| <a name="com.robotemi.sdk.listeners/OnGoToLocationStatusChangedListener/onGoToLocationStatusChanged/#kotlin.String#kotlin.String#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>status| <a name="com.robotemi.sdk.listeners/OnGoToLocationStatusChangedListener/onGoToLocationStatusChanged/#kotlin.String#kotlin.String#kotlin.Int#kotlin.String/PointingToDeclaration/"></a><br><br>Current status.<br><br>|
  
  



