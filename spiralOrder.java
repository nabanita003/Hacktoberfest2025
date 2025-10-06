class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> res;
        if (matrix.size() == 0) return res;

        int rowBegin = 0, rowEnd = matrix.size() - 1;
        int colBegin = 0, colEnd = matrix[0].size() - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse right
            for (int j = colBegin; j <= colEnd; j++)
                res.push_back(matrix[rowBegin][j]);
            rowBegin++;

            // Traverse down
            for (int j = rowBegin; j <= rowEnd; j++)
                res.push_back(matrix[j][colEnd]);
            colEnd--;

            // Traverse left (if needed)
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--)
                    res.push_back(matrix[rowEnd][j]);
                rowEnd--;
            }

            // Traverse up (if needed)
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--)
                    res.push_back(matrix[j][colBegin]);
                colBegin++;
            }
        }
        return res;
    }
};
