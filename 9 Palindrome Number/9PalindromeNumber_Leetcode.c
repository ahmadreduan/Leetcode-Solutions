
bool isPalindrome(int x) {
    if(x < 0) {
        return false;
    }

    int revNum = 0;
    int n = x;

    while(n > 0) {
        int d = n % 10;

        // Check for overflow before multiplying revNum by 10
        if (revNum > (INT_MAX - d) / 10) {
            return false;  // Overflow will happen
        }

        revNum = revNum * 10 + d;
        n /= 10;
    }

    return revNum == x;
}
