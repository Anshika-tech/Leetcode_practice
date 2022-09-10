class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>l=new ArrayList<>();
       int minr = 0;
		int maxr = matrix.length - 1;
		int minc = 0;
		int maxc = matrix[0].length - 1;
		int count = 0;
		int te = matrix.length * matrix[0].length;
		while (count < te) {
			for (int i = minc; i <= maxc && count < te; i++) {
				l.add(matrix[minr][i]);
				count++;

			}
			minr++;
			for (int i = minr; i <= maxr && count < te; i++) {
				l.add(matrix[i][maxc]);
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count < te; i--) {
				l.add(matrix[maxr][i]);
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < te; i--) {
				l.add(matrix[i][minc]);
				count++;
			}
			minc++;

		}
        return l;
        
    }
}