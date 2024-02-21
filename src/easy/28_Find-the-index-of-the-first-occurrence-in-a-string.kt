package easy

class FindTheIndexOfTheFirstOccurrenceInAString {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty()) return -1;
        if (haystack.length < needle.length) return -1;
        if (haystack == needle) return 0;
        for (i in 0 until haystack.length - needle.length + 1) {
            if (haystack.substring(i, i + needle.length) == needle) return i;
        }
        return -1;
    }
}