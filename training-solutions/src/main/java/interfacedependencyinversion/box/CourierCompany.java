package interfacedependencyinversion.box;

public class CourierCompany {
    public static void main(String[] args) {
        Box[] boxes = new Box[4];
        boxes[0] = new SmallBox();
        boxes[1] = new MediumBox();
        boxes[2] = new LargeBox();
        boxes[3] = new ExtraLargeBox();

        for (Box box : boxes) {
            System.out.println(box.getSize() + ": " + box.getPrice());
        }
    }
}
