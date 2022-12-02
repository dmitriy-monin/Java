package GeekBrains.Архитектура.Seminar_1.modelelements;

import java.lang.reflect.Type;
import java.util.Collection;

public class Scene {

    private int id;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

    public Scene(int id, Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public int getId() {
        return id;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(Collection<PoligonalModel> models) {
        this.models = models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(Collection<Flash> flashes) {
        this.flashes = flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(Collection<Camera> cameras) {
        this.cameras = cameras;
    }

    public Type method1(Type type) {
        return type;
    }

    public Type method2(Type type1, Type type2) {
        return type1;
    }
}
