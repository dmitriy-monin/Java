package GeekBrains.ООП.Семинар_5.Lesson_11.Ex003Math.Core.Models;

import GeekBrains.ООП.Семинар_5.Lesson_11.Ex003Math.Mathematics.CalculateArea.Calculate;
import GeekBrains.ООП.Семинар_5.Lesson_11.Ex003Math.Mathematics.Shapes.Canvas;
import GeekBrains.ООП.Семинар_5.Lesson_11.Ex003Math.Mathematics.Shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate c, String canvasName) {
        panel = new Canvas(canvasName);//"Без имени (2).jpg");
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }

}
