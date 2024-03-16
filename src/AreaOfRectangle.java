public class AreaOfRectangle {
    int maxArea = -1;
    int minArea = -1;

    public void calculate() {
        for (int l = 1; l <= 6; l++) {
            for (int w = 1; w <= 6; w++) {
                this.areaOfRectangle(l, w);
            }
        }
        System.out.println("Minimum Area: " + minArea + " & Maximum Area: " + maxArea + ".");
    }

    public void areaOfRectangle(int length, int width) {
        if (length + width >= 8) {
            int area = length * width;
            if (this.minArea == -1 || this.maxArea == -1) {
                this.minArea = area;
                this.maxArea = area;
            }
            if (this.minArea > area) {
                minArea = area;
            }
            if (this.maxArea < area) {
                this.maxArea = area;
            }
            System.out.println("Length = " + length + ", Width = " + width + ", Area = " + area);
        }
    }
}