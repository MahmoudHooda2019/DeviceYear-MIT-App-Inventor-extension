# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.mh.yearofdevice.YearOfDevice {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/mh/yearofdevice/repack'
-flattenpackagehierarchy
-dontpreverify
