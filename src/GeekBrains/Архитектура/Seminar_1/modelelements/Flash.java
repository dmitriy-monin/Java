package GeekBrains.Архитектура.Seminar_1.modelelements;

import java.awt.*;
import java.util.Collection;

public class Flash {

    private Collection<Point3D> location;
    private Collection<Angle3D> angle3DS;
    private Color color;
    private Float power;

    public Flash(Collection<Point3D> location, Collection<Angle3D> angle3DS, Color color, Float power) {
        this.location = location;
        this.angle3DS = angle3DS;
        this.color = color;
        this.power = power;
    }

    public Collection<Point3D> getLocation() {
        return location;
    }

    public Collection<Angle3D> getAngle3DS() {
        return angle3DS;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    public void Rotate(Angle3D angle3D) {

    }

    public void Move(Point3D point3D) {

    }
}
