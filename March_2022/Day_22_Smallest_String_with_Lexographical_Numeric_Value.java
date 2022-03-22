class Solution {
    // O(N)time
// O(N)space
public String getSmallestString(int n, int k) {
    int count = k / 26;
    int mod = k % 26;

    StringBuilder res = new StringBuilder();
    int head = n - count;
    while(head > 1 || mod == 0){
        if(mod == 0){
            count--;
            mod = 26;
            head++;
        }
        res.append('a');
        mod--;
        head--;
    }
    res.append((char)('a' + mod - 1));
    while(count > 0){
        res.append('z');
        count--;
    }
    return res.toString();
}
}