class MovableCircle implements Movable{
    public MovablePoint center;
    public int radius;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    public MovableCircle(MovablePoint center, int radius){
        this.center = center; 
        this.radius = radius;
    }
    @Override
    public String toString(){
        return center.toString() + ", radius = (" + this.radius + ")";
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }
}
