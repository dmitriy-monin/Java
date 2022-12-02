package GeekBrains.Архитектура.Seminar_1.modelelements;

import java.util.Collection;

public class Camera {

    private Collection<Point3D> location;
    private Collection<Angle3D> angle3DS;

    public Camera(Collection<Point3D> location, Collection<Angle3D> angle3DS) {
        this.location = location;
        this.angle3DS = angle3DS;
    }

    public Collection<Point3D> getLocation() {
        return location;
    }

    public Collection<Angle3D> getAngle3DS() {
        return angle3DS;
    }

    public void Rotate(Angle3D angle3D) {

    }

    public void Move(Point3D point3D) {

    }


}
