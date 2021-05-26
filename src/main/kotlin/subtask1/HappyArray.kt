package subtask1

class HappyArray {


    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray = sadArray.toMutableList()
        outer@ while (true) {
            for (i in 1 until happyArray.lastIndex) {
                if (happyArray[i] > happyArray[i - 1] + happyArray[i + 1]) {
                    happyArray.removeAt(i)
                    continue@outer
                }
            }
            break
        }
        return happyArray.toIntArray()
    }
}
