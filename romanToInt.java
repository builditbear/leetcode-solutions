class Solution {
    public int romanToInt(String s) {
        int integerValue = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean nextCharExists = i + 1 < s.length();
            switch(c) {
                case 'I':
                    if(nextCharExists) {
                        if(s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                            integerValue--;
                        } else {
                            integerValue++;
                        }
                        break;
                    } else {
                        integerValue++;
                        break;
                    }
                case 'V':
                    integerValue += 5;
                    break;
                case 'X':
                    if(nextCharExists) {
                        if(s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                            integerValue -= 10;
                        } else {
                            integerValue += 10;
                        }
                        break;
                    } else {
                        integerValue += 10;
                        break;
                    }
                case 'L':
                    integerValue += 50;
                    break;
                case 'C':
                    if(nextCharExists) {
                        if(s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                            integerValue -= 100;
                        } else {
                            integerValue += 100;
                        }
                        break;
                    } else {
                        integerValue += 100;
                        break;
                    }
                case 'D':
                    integerValue += 500;
                    break;
                case 'M':
                    integerValue += 1000;
                    break;
            }       
        }
        return integerValue;
    }
}