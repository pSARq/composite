package org.example2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements CompositeComponent {

    private final List<Component> children = new ArrayList<>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }

    @Override
    public void operation() {
        for (Component component: children) {
            component.operation();
        }
    }
}
