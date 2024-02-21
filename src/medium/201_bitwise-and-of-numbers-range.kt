package medium

class BitwiseAndOfNumbersRange {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var shift = 0;
        var n = left;
        var m = right;

        while (n < m) {
            n = n shr 1;
            m = m shr 1;
            shift++;
        }

        return n shl shift;
    }
}