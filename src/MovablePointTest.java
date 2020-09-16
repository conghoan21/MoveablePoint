public class MovablePointTest {
    public static void main(String[] args){
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(2,3,4,5);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);
    }
}
