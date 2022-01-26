//[sdk](../../../index.md)/[com.robotemi.sdk](../index.md)/[Robot](index.md)/[requestPermissions](request-permissions.md)



# requestPermissions  
[androidJvm]  
Content  
fun [requestPermissions](request-permissions.md)(permissions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Permission](../../com.robotemi.sdk.permission/-permission/index.md)>, requestCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  
More info  


Request permissions.



If you already had the permission, Launcher will not handle this request again.



Add [OnRequestPermissionResultListener](../../com.robotemi.sdk.permission/-on-request-permission-result-listener/index.md) to listen the request result.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.robotemi.sdk/Robot/requestPermissions/#kotlin.collections.List[com.robotemi.sdk.permission.Permission]#kotlin.Int/PointingToDeclaration/"></a>permissions| <a name="com.robotemi.sdk/Robot/requestPermissions/#kotlin.collections.List[com.robotemi.sdk.permission.Permission]#kotlin.Int/PointingToDeclaration/"></a><br><br>A list holds the permissions you want to request.<br><br>|
| <a name="com.robotemi.sdk/Robot/requestPermissions/#kotlin.collections.List[com.robotemi.sdk.permission.Permission]#kotlin.Int/PointingToDeclaration/"></a>requestCode| <a name="com.robotemi.sdk/Robot/requestPermissions/#kotlin.collections.List[com.robotemi.sdk.permission.Permission]#kotlin.Int/PointingToDeclaration/"></a><br><br>Identify which request.<br><br>|
  
  



