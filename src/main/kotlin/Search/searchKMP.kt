package Search

import java.util.stream.Collectors

fun main() {
    var  pattern = "Joni";
    var text = "Hello Joni you from Russia ?"

    var  foundIndexes = performKMPSearch(text, pattern);

    if (foundIndexes.isEmpty()) {
        System.out.println("Pattern not found in the given text String");
    } else {
        System.out.println("Pattern found in the given text String at positions: " + foundIndexes.stream().map(Int::toString).collect(
            Collectors.joining(", ")));
    }
}


fun compilePatternArray(str: String): IntArray {
    var strlinght = str.length
    var len = 0
    var i = 1
    var compleiPatternArray = IntArray(strlinght)
    compleiPatternArray[0] = 0

    while (i < strlinght) {
        if (str[i] == str[len]) {
            len++
            compleiPatternArray[i] = len
            i++
        } else {
            if (len != 0) {
                len = compleiPatternArray[len - 1]
            } else {
                compleiPatternArray[i] = len
                i++
            }
        }
    }
    return compleiPatternArray
}


fun performKMPSearch(text: String, pattern: String): List<Int> {
    var compilePatternArray = compilePatternArray(pattern)
    var textIndex = 0
    var patternIndex = 0
    var listFoundIndexes  = ArrayList<Int>()

    while (textIndex < text.length) {
        if (pattern[patternIndex] == text[textIndex]) {
            patternIndex++
            textIndex++
        }
        if (patternIndex == pattern.length) {
            listFoundIndexes.add(textIndex - patternIndex)
            patternIndex = compilePatternArray[patternIndex - 1]
        } else if (textIndex < text.length && pattern[patternIndex] != text[textIndex]) {
            if (patternIndex != 0) {
                patternIndex = compilePatternArray[patternIndex - 1]
            } else {
                textIndex = textIndex + 1
            }
        }
    }
    return listFoundIndexes
}