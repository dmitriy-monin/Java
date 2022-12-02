package GeekBrains.Архитектура.Seminar_1.inmemorymodel;

import GeekBrains.Архитектура.Seminar_1.modelelements.Camera;
import GeekBrains.Архитектура.Seminar_1.modelelements.Flash;
import GeekBrains.Архитектура.Seminar_1.modelelements.PoligonalModel;
import GeekBrains.Архитектура.Seminar_1.modelelements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger {

    private Collection<PoligonalModel> models;
    private Collection<Scene> scenes;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;
    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        changeObservers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        changeObservers.remove(o);
    }

    @Override
    public void NotifyChange(ModelChanger sender) {
        for (ModelChangedObserver o : changeObservers) {
            System.out.println(sender);
        }
    }

    public ModelStore(Collection<PoligonalModel> models, Collection<Scene> scenes, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Scene> getScenes() {
        return scenes;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public Collection<ModelChangedObserver> getChangeObservers() {
        return changeObservers;
    }

    public Collection<Scene> getScena(Integer integer) {
        return null;
    }

    public void notifyChange(ModelChanger modelChanger) {
        NotifyChange(modelChanger);
    }
}