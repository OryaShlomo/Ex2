package assignments;

public class Cell1 {
    public static boolean isNumber(String text) {
        if (text != null) {
            try {
                double k = Double.parseDouble(text);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

    public static boolean isText(String text) {
        if (isNumber(text)) {
            return false;
        }
        if (isForm(text)) {
            return false;
        }
        return true;
    }

    public static boolean isOp(char c) {
        boolean ans = true;
        char[] arr = {'*', '+', '/', '-'};
        int counter = 0;
        for (int j = 0; j < arr.length; j++) {
            if (c == arr[j]) {
                counter++;
                break;
            }
        }
        if (counter == 0) {
            ans = false;
        }
        return ans;
    }

    public static int howManyOp(String text) {
        int depth = 0;
        for (int i = 0; i < text.length(); i++) {
            if (isOp(text.charAt(i))) {
                depth++;
            }
        }
        return depth;
    }

    public static int depth(String text) {
        int ans = 0;
        for (int i = 0; i < text.length(); i++) {
            if (isOp(text.charAt(i))) {
                if (text.charAt(i) == '+' || text.charAt(i) == '-') {
                    ans = 1;
                }
            }
        }
        return ans;
    }

    public static boolean canBeComputeNow(String s) {
        if (s != null && !s.isEmpty()) {
            if (isNumber(s)) {
                return true;
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (isOp(s.charAt(i))) {
                        String v = s.substring(0, i);
                        String k = s.substring(i + 1);
                        if ((isNumber(k) || canBeComputeNow(k)) && (isNumber(v) || canBeComputeNow(v))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int mainOpIndex(String text) {
        int ans = 0;


        return ans;
    }

    public static boolean isForm(String text) {
        if (text.charAt(0) != '=') {
            return false;
        } else {
            String k = text.substring(1, text.length() - 1);

        }
        return true;
    }

    /*
    int[][] depth(assignments.Sheet s) {
	int[][] ans = new int[w][h];
	init each cell in ans to  -1;

int depth = 0, count = 0, max = w*h;
boolean flagC = true;
while(count <max && flagC) {
		flagC = false;
for(int x = 0;;x<w;x++) {
for(int y = 0;y<h;y++) {
			if(canBeCompudedNow(x,y)) { // DIY
				ans[x][y] = depth;
				counter+=1;
				flagC=true;
} // if
} // for yt
}  // for x
depth+=1;
} while
	return ans;
}

     */
    public static int findMainIndexOp(String s) {
        int ans = 0;


        return ans;
    }

    public static int DoublecomputeForm(String form) {
        int ans = 0;

        return ans;
    }

}
