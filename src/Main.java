import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        execute(19);
    }

    public static void execute(int totalRows) {
        List<List<Integer>> rows = new ArrayList<>();
        int total = 1;
        int upperBound = 1;
        for(int i = 0;i<(totalRows/2)+1;i++) {
            upperBound++;
            List<Integer> nums = new ArrayList<>();
            for(int j = 1;j<upperBound;j++) {
                nums.add(total);
                total++;
            }
            rows.add(nums);
        }


        int spacer = (rows.size()/2)+2;

        for(int i = 0;i<rows.size();i++) {
            for(int x = 0;x < spacer;x++) {
                System.out.print(" ");
            }
            spacer--;
            for(int j = 0;j<rows.get(i).size();j++) {
                System.out.print(" ");
                System.out.print(rows.get(i).get(j));
            }
            System.out.println();
        }
        spacer = 1;
        for(int i = rows.size()-2;i>-1;i--) {
            for(int x = 0;x<spacer;x++) {
                System.out.print(" ");
            }
            spacer++;
            for(int j = 0;j<rows.get(i).size();j++) {
                System.out.print(" ");
                System.out.print(rows.get(i).get(j));
            }
            System.out.println();
        }
    }
}

