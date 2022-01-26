//[sdk](../../../index.md)/[com.robotemi.sdk.map](../index.md)/[MapDataModel](index.md)



# MapDataModel  
 [androidJvm] data class [MapDataModel](index.md)(**mapImage**: [MapImage](../-map-image/index.md), **mapId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **mapInfo**: [MapInfo](../-map-info/index.md), **virtualWalls**: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Layer](../-layer/index.md)>, **greenPaths**: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Layer](../-layer/index.md)>, **locations**: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Layer](../-layer/index.md)>) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)   


## Constructors  
  
| | |
|---|---|
| <a name="com.robotemi.sdk.map/MapDataModel/MapDataModel/#android.os.Parcel/PointingToDeclaration/"></a>[MapDataModel](-map-data-model.md)| <a name="com.robotemi.sdk.map/MapDataModel/MapDataModel/#android.os.Parcel/PointingToDeclaration/"></a> [androidJvm] fun [MapDataModel](-map-data-model.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.map/MapDataModel.CREATOR///PointingToDeclaration/"></a>[CREATOR](-c-r-e-a-t-o-r/index.md)| <a name="com.robotemi.sdk.map/MapDataModel.CREATOR///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [CREATOR](-c-r-e-a-t-o-r/index.md) : [Parcelable.Creator](https://developer.android.com/reference/kotlin/android/os/Parcelable.Creator.html)<[MapDataModel](index.md)>   <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.map/MapDataModel/greenPaths/#/PointingToDeclaration/"></a>[greenPaths](green-paths.md)| <a name="com.robotemi.sdk.map/MapDataModel/greenPaths/#/PointingToDeclaration/"></a> [androidJvm] var [greenPaths](green-paths.md): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Layer](../-layer/index.md)>   <br>|
| <a name="com.robotemi.sdk.map/MapDataModel/locations/#/PointingToDeclaration/"></a>[locations](locations.md)| <a name="com.robotemi.sdk.map/MapDataModel/locations/#/PointingToDeclaration/"></a> [androidJvm] var [locations](locations.md): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Layer](../-layer/index.md)>   <br>|
| <a name="com.robotemi.sdk.map/MapDataModel/mapId/#/PointingToDeclaration/"></a>[mapId](map-id.md)| <a name="com.robotemi.sdk.map/MapDataModel/mapId/#/PointingToDeclaration/"></a> [androidJvm] var [mapId](map-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|
| <a name="com.robotemi.sdk.map/MapDataModel/mapImage/#/PointingToDeclaration/"></a>[mapImage](map-image.md)| <a name="com.robotemi.sdk.map/MapDataModel/mapImage/#/PointingToDeclaration/"></a> [androidJvm] @(value = Map_Image)  <br>  <br>var [mapImage](map-image.md): [MapImage](../-map-image/index.md)   <br>|
| <a name="com.robotemi.sdk.map/MapDataModel/mapInfo/#/PointingToDeclaration/"></a>[mapInfo](map-info.md)| <a name="com.robotemi.sdk.map/MapDataModel/mapInfo/#/PointingToDeclaration/"></a> [androidJvm] var [mapInfo](map-info.md): [MapInfo](../-map-info/index.md)   <br>|
| <a name="com.robotemi.sdk.map/MapDataModel/virtualWalls/#/PointingToDeclaration/"></a>[virtualWalls](virtual-walls.md)| <a name="com.robotemi.sdk.map/MapDataModel/virtualWalls/#/PointingToDeclaration/"></a> [androidJvm] var [virtualWalls](virtual-walls.md): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Layer](../-layer/index.md)>   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.map/MapDataModel/describeContents/#/PointingToDeclaration/"></a>[describeContents](describe-contents.md)| <a name="com.robotemi.sdk.map/MapDataModel/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [describeContents](describe-contents.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.robotemi.sdk.map/MapDataModel/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](write-to-parcel.md)| <a name="com.robotemi.sdk.map/MapDataModel/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeToParcel](write-to-parcel.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|

