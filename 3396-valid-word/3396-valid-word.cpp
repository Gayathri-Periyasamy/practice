class Solution {
public:
    bool vowel(char x) {
        return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ||
                x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U');
    }

    bool consonant(char x) {
        return (!isalpha(x) ? false : !vowel(x));
    }

    bool isValid(string word) {
        if (word.size() < 3) return false;

        bool vow = false, cons = false;

        for (char c : word) {
            if (!isalnum(c)) return false;

            if (vowel(c)) vow = true;
            if (consonant(c)) cons = true;
        }

        return vow && cons;
    }
};