package com.itstep.homework.classes;

public class Converter {

    private static String[] english = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
    private static String[] russian = {"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "ф", "ы", "в", "а", "п", "р", "о", "л", "д", "я", "ч", "с", "м", "и", "т", "ь"};

    public static StringBuilder convert(String englishStr) {

        StringBuilder newWord = new StringBuilder("");
        for (int i = 0; i < englishStr.length(); i++) {
            if (Character.isLetter(englishStr.charAt(i))) {
                for (int j = 0; j < english.length; j++) {
                    if (Character.toString(englishStr.charAt(i)).equals(english[j])) {
                        newWord = newWord.append(russian[j]);
                    } else {
                        continue;
                    }
                }
            } else {
                newWord = newWord.append(englishStr.charAt(i));
            }
        }
        return newWord;
    }

    public static StringBuilder checkLetter(String englishStr) {
        int countEng = 0;
        int countRus = 0;
        StringBuilder example = new StringBuilder(englishStr);
        for (int i = 0; i < englishStr.length(); i++) {
            char ch = englishStr.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || ch >= 'A' && ch <= 'Z') {
                countEng++;
            } else if ((ch >= 'а' && ch <= 'я') || ch >= 'А' && ch <= 'Я') {
                countRus++;
            }
        }
        if(countEng > countRus){
            return convert(englishStr);
        }
        return example;
    }
}
