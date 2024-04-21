class Solution {
public:
    void rotate(vector<vector<int>>& m) {
        int n = m.size();
        for(int i = 0; i < ceil(float(n) / 2); i++){
            for(int j = 0; j < n / 2; j++){
                int r1 = j, c1 = n - i -1;
                swap(m[r1][c1], m[i][j]);
                
                int r2 = c1, c2 = n - 1 - r1;
                swap(m[r2][c2], m[i][j]);
                
                int r3 = c2, c3 = n - 1 - r2;
                swap(m[r3][c3], m[i][j]);
            }
        }
    }
};