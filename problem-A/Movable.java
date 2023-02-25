class Movable{
    public static void main(String[] args){
        MovablePoint myPoint = new MovablePoint(2, 2 , 1, 1);
        MovableCircle myCircle = new MovableCircle(2, 2, 1, 1, 3);
        System.out.println(myPoint.toString());
        System.out.println(myCircle.toString());

    }
}

interface Movable{
    public abstract void moveUp();
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
}
