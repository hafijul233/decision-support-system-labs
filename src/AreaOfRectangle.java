public class AreaOfRectangle {
    int maxArea = -1;
    int minArea = -1;

    public void calculate(int maxLength, int maxWidth, int minLengthWidthSum) {
        for (int l = 1; l <= maxLength; l++) {
            for (int w = 1; w <= maxWidth; w++) {
                this.areaOfRectangle(l, w, minLengthWidthSum);
            }
        }
        System.out.println("Minimum Area: " + minArea + " & Maximum Area: " + maxArea + ".");
    }

    public void areaOfRectangle(int length, int width, int minLengthWidthSum) {
        if (length + width >= minLengthWidthSum) {
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