package id.co.fasyah;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private int count;
    private List<String> longestThan5 = new ArrayList<>();

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getLongestThan5() {
        return longestThan5;
    }

    public void setLongestThan5(List<String> longestThan5) {
        this.longestThan5 = longestThan5;
    }
}
