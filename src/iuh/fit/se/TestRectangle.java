/*
 * @ (#) TestRectangle.java       1.0     22/8/24
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
import java.util.Scanner ;
public class TestRectangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("getLenght: ");
            double length = scanner.nextDouble();
            System.out.print("getWidth: ");
            double width = scanner.nextDouble();

            Rectangle
            rectangle = new Rectangle(length, width);

            System.out.println("Diện tích: " + rectangle.getArea());
            System.out.println("Chu vi: " + rectangle.getPerimeter());
            System.out.println("Hình chữ nhật: " + rectangle);
        }
    }



