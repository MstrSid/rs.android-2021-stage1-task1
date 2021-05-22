package subtask1

class HappyArray {


    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray: IntArray = sadArray
        while (checkOnSad(happyArray)) {
            var tempArray = intArrayOf()
            tempArray+=happyArray.first()
            for (i in 1 until happyArray.lastIndex) {
                if (happyArray[i] < happyArray[i - 1] + happyArray[i + 1]) {
                    tempArray += happyArray[i]
                } else {
                    continue
                }
            }
            tempArray+=happyArray.last()
            happyArray = tempArray
        }
        return happyArray
    }

    private fun checkOnSad(tempArray: IntArray): Boolean{
        var isSad = false
        for(i in 1 until tempArray.lastIndex) {
            isSad = tempArray[i] > tempArray[i - 1] + tempArray[i + 1]
            if(isSad) break
        }
        return isSad
    }
}
