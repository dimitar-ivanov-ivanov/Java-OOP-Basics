package com.company.Shapes;

import com.company.Shapes.Interfaces.Drawable;
import com.company.Shapes.Models.Circle;
import com.company.Shapes.Models.Rectangle;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < 3; i++) {
            queue.add(Integer.parseInt(scanner.nextLine()));
        }

        Drawable circle = new Circle(queue.poll());
        Drawable rect = new Rectangle(queue.poll(), queue.poll());

        circle.draw();
        rect.draw();

    }
}
