class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minRecolors = Integer.MAX_VALUE;
        int countW = 0;

        // Count 'W' in the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                countW++;
            }
        }

        // Initialize the minimum recolors with the first window
        minRecolors = countW;

        // Slide the window across the string
        for (int i = k; i < n; i++) {
            // Add the new character in the window
            if (blocks.charAt(i) == 'W') {
                countW++;
            }
            // Remove the character that is sliding out of the window
            if (blocks.charAt(i - k) == 'W') {
                countW--;
            }
            // Update the minimum recolors
            minRecolors = Math.min(minRecolors, countW);
        }

        return minRecolors;
    }
}
