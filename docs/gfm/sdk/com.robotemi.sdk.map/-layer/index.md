//[sdk](../../../index.md)/[com.robotemi.sdk.map](../index.md)/[Layer](index.md)



# Layer  
 [androidJvm] data class [Layer](index.md)(**layerCreationUTC**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **layerCategory**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **layerId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **layerThickness**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **layerStatus**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **layerPoses**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LayerPose](../-layer-pose/index.md)>?) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)   


## Constructors  
  
| | |
|---|---|
| <a name="com.robotemi.sdk.map/Layer/Layer/#android.os.Parcel/PointingToDeclaration/"></a>[Layer](-layer.md)| <a name="com.robotemi.sdk.map/Layer/Layer/#android.os.Parcel/PointingToDeclaration/"></a> [androidJvm] fun [Layer](-layer.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.map/Layer.CREATOR///PointingToDeclaration/"></a>[CREATOR](-c-r-e-a-t-o-r/index.md)| <a name="com.robotemi.sdk.map/Layer.CREATOR///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [CREATOR](-c-r-e-a-t-o-r/index.md) : [Parcelable.Creator](https://developer.android.com/reference/kotlin/android/os/Parcelable.Creator.html)<[Layer](index.md)>   <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.map/Layer/layerCategory/#/PointingToDeclaration/"></a>[layerCategory](layer-category.md)| <a name="com.robotemi.sdk.map/Layer/layerCategory/#/PointingToDeclaration/"></a> [androidJvm] @(value = layer_category)  <br>  <br>val [layerCategory](layer-category.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.robotemi.sdk.map/Layer/layerCreationUTC/#/PointingToDeclaration/"></a>[layerCreationUTC](layer-creation-u-t-c.md)| <a name="com.robotemi.sdk.map/Layer/layerCreationUTC/#/PointingToDeclaration/"></a> [androidJvm] @(value = layer_creation_universal_time)  <br>  <br>val [layerCreationUTC](layer-creation-u-t-c.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.robotemi.sdk.map/Layer/layerId/#/PointingToDeclaration/"></a>[layerId](layer-id.md)| <a name="com.robotemi.sdk.map/Layer/layerId/#/PointingToDeclaration/"></a> [androidJvm] @(value = layer_id)  <br>  <br>val [layerId](layer-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|
| <a name="com.robotemi.sdk.map/Layer/layerPoses/#/PointingToDeclaration/"></a>[layerPoses](layer-poses.md)| <a name="com.robotemi.sdk.map/Layer/layerPoses/#/PointingToDeclaration/"></a> [androidJvm] @(value = layer_poses)  <br>  <br>val [layerPoses](layer-poses.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LayerPose](../-layer-pose/index.md)>?   <br>|
| <a name="com.robotemi.sdk.map/Layer/layerStatus/#/PointingToDeclaration/"></a>[layerStatus](layer-status.md)| <a name="com.robotemi.sdk.map/Layer/layerStatus/#/PointingToDeclaration/"></a> [androidJvm] @(value = layer_status)  <br>  <br>val [layerStatus](layer-status.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.robotemi.sdk.map/Layer/layerThickness/#/PointingToDeclaration/"></a>[layerThickness](layer-thickness.md)| <a name="com.robotemi.sdk.map/Layer/layerThickness/#/PointingToDeclaration/"></a> [androidJvm] @(value = layer_thickness)  <br>  <br>val [layerThickness](layer-thickness.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.robotemi.sdk.map/Layer/describeContents/#/PointingToDeclaration/"></a>[describeContents](describe-contents.md)| <a name="com.robotemi.sdk.map/Layer/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [describeContents](describe-contents.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.robotemi.sdk.map/Layer/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.robotemi.sdk.map/Layer/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|
| <a name="com.robotemi.sdk.map/Layer/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](write-to-parcel.md)| <a name="com.robotemi.sdk.map/Layer/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [writeToParcel](write-to-parcel.md)(parcel: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|

