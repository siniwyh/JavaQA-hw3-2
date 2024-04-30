public class BmiService {
    public int calculate(double h, int w) {
        int index = (int) (w / (h*h));
        return index;

    }

}
