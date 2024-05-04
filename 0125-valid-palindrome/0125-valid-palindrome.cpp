

class Solution {
private:
    bool validChar(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }

    char toLowerCase(char ch) { //change to lower case
        if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            return ch;
        } else {
            char temp = ch - 'A' + 'a';
            return temp;
        }
    }

    bool checkPalindrome(string s) { //check if the string is palindrome or not
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s[start] != s[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

public:
    bool isPalindrome(string s) {
        string temp = "";

        for (int j = 0; j < s.length(); j++) {
            if (validChar(s[j])) {
                temp.push_back(s[j]);
            }
        }

        for (int j = 0; j < temp.length(); j++) {
            temp[j] = toLowerCase(temp[j]);
        }

        return checkPalindrome(temp);
    }
};
