class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result = new int[2];

        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (String str : keyinput) {
            switch (str) {
                case "left":
                    if (result[0] - 1 <= maxX && result[0] - 1 >= -maxX) {
                        result[0] += -1;
                        break;
                    } else {
                        break;
                    }
                case "right":
                    if (result[0] +1  <= maxX && result[0] +1 >= -maxX) {
                        result[0] +=1;
                        break;
                    }else break;
                case "down":
                    if (result[1] -1 <= maxY && result[1] -1 >=-maxY) {
                        result[1] +=-1;
                        break;
                    }else break;
                case "up":
                    if (result[1] +1 <= maxY && result[1]+1 >= -maxY) {
                        result[1] +=1;
                        break;
                    }else break;
            }

        }
        return result;
    }
}