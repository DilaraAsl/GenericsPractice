package com.cydeo;
// This class holds two coordinates X and Y. The data type of the coordinates is generic.
public class Point <T> {
  private T xCoordinate;
  private T yCoordinate;
  public Point(T xCoordinate,T yCoordinate){
      this.xCoordinate=xCoordinate;
      this.yCoordinate=yCoordinate;
  }

    public T getXCoordinate() {
        return xCoordinate;
    }

    public T getYCoordinate() {
        return yCoordinate;
    }

    public void setXCoordinate(T xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(T yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
