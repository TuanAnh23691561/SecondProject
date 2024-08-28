/*
 * @ (#) Rectangle.java       1.0     22/8/24 
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
 
package iuh.fit.se;
 
/*
 * @description:
 * @author: Nguyen Tuan Anh 
 * @date: 22/8/24
 * @version:   1.0
 */

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");

        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width + '}';
    }
}



