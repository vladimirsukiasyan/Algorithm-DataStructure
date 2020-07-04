fun main(){
    val dynamicArray = intArrayOf(1,2,3)
//    0x00000123 - 0
//    0x00000127 - 1
//    0x00000131 - 2
//    0x00000135 - 3
//    ....
//    0x00000931 - 12341213353
    val elem = dynamicArray[3] // O(1) - const
//    0x00000123+12341213353*4 = 0x00000931
}