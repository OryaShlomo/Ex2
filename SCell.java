package assignments;//package assignments.ex2;
// Add your documentation below:

public class SCell implements Cell {
    private String line;
    private int type;
    // Add your code here
// הפונקציות שצריך: isText, isNumber, isForm, computeForm
// isForm מורכבת מmainOpIndex, canBeComputeNow, depth.

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







///////// מכאן והלאה נשאר רק לטפל בorder  get and set


    public SCell(int a){type = a;}

    public SCell(String s) {
        // Add your code here
        line=s;

        setData(s);
    }

    @Override
    public int getOrder() {
        // Add your code here

        return 0;
        // ///////////////////
    }

    //@Override
    @Override
    public String toString() {
        return getData();
    }

    @Override
public void setData(String s) {
        // Add your code here
        line = s;
        /////////////////////
    }
    @Override
    public String getData() {
        return line;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public void setType(int t) {
        type = t;
    }

    @Override
    public void setOrder(int t) {
        // Add your code here
        //type=t;
    }
}
