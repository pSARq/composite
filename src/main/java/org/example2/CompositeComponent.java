package org.example2;

public interface CompositeComponent extends Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
}
