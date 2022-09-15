public class Main {
    public static void main(String[] args) {
        System.out.println("task 1,2,3,4");
        int[] box1 = new int[3];
        box1[0] = 1;
        box1[1] = 2;
        box1[2] = 3;
        System.out.print(box1[0] + ", ");
        System.out.print(box1[1] + ", ");
        System.out.print(box1[2]);
        System.out.println();
        System.out.print(box1[2] + ", ");
        System.out.print(box1[1] + ", ");
        System.out.print(box1[0]);
        System.out.println();

        double[] weight = {1.57, 7.654, 9.986};
        System.out.print(weight[0] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.print(weight[2]);
        System.out.println();
        System.out.print(weight[2] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.print(weight[0]);
        System.out.println();

        int[] color = {89, 6, 2, 5, 77};
        System.out.print(color[0] + ", ");
        System.out.print(color[1] + ", ");
        System.out.print(color[2] + ", ");
        System.out.print(color[3] + ", ");
        System.out.print(color[4]);
        System.out.println();
        System.out.print(color[4] + ", ");
        System.out.print(color[3] + ", ");
        System.out.print(color[2] + ", ");
        System.out.print(color[1] + ", ");
        System.out.print(color[0]);
        System.out.println();

        for (int i = 0; i < 3; i++) {
            int[] box2 = new int[]{1, 2, 3};
            box2[0] = 1;
            box2[1] = 2;
            box2[2] = 3;
            box2[0] = box2[0] + 1;
            box2[2] = box2[2] + 1;
            System.out.print(box2[i] + " ");
        }
    }
}
